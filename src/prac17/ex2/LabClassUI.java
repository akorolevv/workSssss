package prac17.ex2;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Comparator;

public class LabClassUI extends JFrame
{

    private ArrayList<Student> students;
    private JTable studTable;

    // Аргумент - список студентов
    public LabClassUI(ArrayList<Student> students)
    {
        // Заголовок
        super("Студенты");

        // Операция закрытия
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Размер окна
        setSize(640, 480);

        // Установка по центру
        setLocationRelativeTo(null);

        this.students = students;

        // Создание панели для кнопок и самих кнопок
        JPanel pN = new JPanel(new FlowLayout());
        JButton addStudentBtn = new JButton("Добавить студента");
        JButton remStudentBtn = new JButton("Удалить студента");
        JButton findStudentBtn = new JButton("Найти студента");

        pN.add(addStudentBtn);
        pN.add(remStudentBtn);
        pN.add(findStudentBtn);

        // Добавление обработчика событий. При нажатии на кнопку сработает метод addBtnClicked();
        // 1 - Нажатие кнопки addStudentBtn, создаётся "событие"
        // 2 - e будет содержать информацию об этом событии
        // 3 - Вызов метода addActionListener, в качестве аргумента которому передаётся e
        // 4 - Выполнение блоков
        addStudentBtn.addActionListener(e ->
        {
            try
            {
                addBtnClicked();
            }
            catch (IllegalArgumentException ex)
            {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        // Добавление обработчика событий. При нажатии на кнопку сработает метод remBtnClicked()
        remStudentBtn.addActionListener(e-> remBtnClicked());

        // Добавление обработчика событий. При нажатии на кнопку сработает метод findBtnClicked();
        findStudentBtn.addActionListener(e->
        {
            try{

                findBtnClicked();
            }
            catch (StudentNotFoundException ex)
            {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        // Создаение JTable
        Object[] headers = new String[] {"ФИО", "Возраст", "Группа", "Средний балл"}; // Заголовки для таблицы

        Object [][] startStudents = new String[students.size()][4]; // Создание двумерного массива, который инициализируется списком
        // Двумерный массив нужен, поскольку в таблице несколько столбцов ("ФИО", "Возраст", "Группа", "Средний балл")
        // Каждая строка - соответсвует студенту, каждый стобец - какой-то характеристике


        // startStudents[i][0] - 0 столбец в i строке
        for(int i = 0; i < students.size(); i++)
        {
            startStudents[i][0] = students.get(i).getFio();
            startStudents[i][1] = ((Integer)(students.get(i).getAge())).toString();
            startStudents[i][2] = ((Integer)(students.get(i).getGroupNum())).toString();
            startStudents[i][3] = ((Integer)(students.get(i).getAvgPoint())).toString();
        }

        // Создаение таблицы, модель данных - DefaultTableModel. Аргументы - информация о студентах и заголовки столбцов.
        studTable = new JTable(new DefaultTableModel(startStudents, headers))
        {
            // Яйчейки не могут быть отредактированы
            @Override
            public boolean isCellEditable(int x, int y)
            {
                return false;
            }
        };

        JTableHeader header = studTable.getTableHeader();
        header.setReorderingAllowed(false); // Запрещаем изменение порядка столбцов
        header.setResizingAllowed(false); // Запрещаем менять ширину столбцов


        // Для заголовков устанавливаем слушателя, который будет выполнять сортировку при нажатии на заголовок
        // header - заголовок столбца
        header.addMouseListener(new MouseInputListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                int count = e.getClickCount();
                if (count == 2) // Устанавливаем, что кликов должно быть 2
                {
                    // header.getHeaderRect(...) - проверяет, был ли двойной клик в области, если да - выполняет сортировка столбца
                    if(header.getHeaderRect(0).contains(e.getX(), e.getY()))
                        sortStudents(Student::compareTo);
                    if(header.getHeaderRect(1).contains(e.getX(), e.getY()))
                        sortStudents(Student.AGE_COMP);
                    if(header.getHeaderRect(2).contains(e.getX(), e.getY()))
                        sortStudents(Student.GROUP_COMP);
                    if(header.getHeaderRect(3).contains(e.getX(), e.getY()))
                        sortStudents(Student.AVG_COMP);
                }
            }

            // Описание других методов класса MouseInputListener и MouseListener

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        // Adding comps
        getContentPane().add(new JScrollPane(studTable), BorderLayout.CENTER); // Добавление прокрутки в центр

        getContentPane().add(pN, BorderLayout.NORTH); // Перемещение самих кнопок

        setVisible(true);
    }

    // Сортировка работает в зависимости от того, какой компаратор будет ей передан в качестве аргумента

    private void sortStudents(Comparator<Student> comp)
    {
        Student temp;
        for (int i = 1; i < students.size(); i++) {
            Student current = students.get(i);
            int j = i-1;
            for(; j >= 0 && comp.compare(current, students.get(j)) < 0; j--) {
                students.set(j+1, students.get(j));
            }
            students.set(j+1, current);
        }
        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

        for (int i = 0; i < students.size(); i++) {
            dtm.removeRow(i);
            Student st = students.get(i);
            dtm.insertRow(i, new Object[]{st.getFio(), st.getAge(), st.getGroupNum(), st.getAvgPoint()});
        }
    }


    // Метод вызывается при нажатии на кнопку найти студента
    //
    private void findBtnClicked() throws StudentNotFoundException
    {
        // Запрашивание с помощью диалогового окна фио студента
        String s = JOptionPane.showInputDialog("Введите искомые ФИО");

        // Проходится по студентам и сравнивает с введённым ФИО
        for(int i = 0; i < students.size(); i++)
        {
            if(students.get(i).getFio().equals(s))
            {
                // Если нашёлся - выводит диалоговое окно с отображением информации о нём
                // this - окно будет в области текущего окна и пока не будет закрыто, с предыдущим окном взаимодействовать нельзя

                JOptionPane.showMessageDialog(this, "Найден студент: "+ students.get(i).toString());
                return;
            }
        }
        // Если не нашёлся, выводится пользовательское исключение
        throw new StudentNotFoundException(s);
    }


    // Метод, который вызывается при удалении студента.
    private void remBtnClicked()
    {
        int c = studTable.getSelectedRowCount();
        // Проверка, что выбрана одна строка в таблице
        if(c != 1)
        {
            JOptionPane.showMessageDialog(this, "Выберете ровно одну строку!");
            return;
        }
        // Удаление, если всё впорядке
        c = studTable.getSelectedRow();
        students.remove(c);
        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();
        dtm.removeRow(c);

    }


    // Метод который вызывается при нажатии кнопки "Добавить студента"
    private void addBtnClicked() throws IllegalArgumentException
    {
        // Запрашивает через окно последовательно все данные
        String fio = JOptionPane.showInputDialog("Пожалуйста, введите фио!");

        // Если ФИО пустое, вызовется пользовательское исключение
        if(fio.equals("")) throw new EmptyStringException();

        String age = JOptionPane.showInputDialog("Пожалуйста, введите возраст!");
        if(age.equals("")) throw new EmptyStringException();
        String group = JOptionPane.showInputDialog("Пожалуйста, введите номер группы!");
        if(group.equals("")) throw new EmptyStringException();
        String avg = JOptionPane.showInputDialog("Пожалуйста, введите средний балл!");
        if(avg.equals("")) throw new EmptyStringException();

        int avgI = 0;
        int groupI = 0;
        int ageI = 0;
        try
        {
            // parseInt - перевод из строки в число
            avgI = Integer.parseInt(avg);
            groupI = Integer.parseInt(group);
            ageI = Integer.parseInt(age);
        }
        catch (NumberFormatException e) // Исключение если не получилось преобразовать строку в число
        {
            throw new NumberFormatException("Невозможно строку "+e.getMessage().substring(17) + " в число!");
        }

        // Добавление нового студента
        students.add(new Student(fio, avgI, groupI, ageI));

        // получение модели данных
        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

        // добавление новой строки данных в модель таблицы studTable
        dtm.addRow(new Object[]{fio, age, group, avg});
    }
}