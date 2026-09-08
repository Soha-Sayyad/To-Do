import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDo extends JFrame {

    // GUI components
    private JTextField taskField;
    private DefaultListModel<String> taskModel;
    private JList<String> taskList;
    private JButton addButton;
    private JButton deleteButton;

    public ToDo() {

        // Frame settings
        setTitle("To-Do List");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main panel
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // -------------------------
        // TOP PANEL
        // -------------------------

        JPanel inputPanel = new JPanel(new BorderLayout(10, 10));

        taskField = new JTextField();

        addButton = new JButton("Add Task");

        inputPanel.add(taskField, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        // -------------------------
        // TASK LIST
        // -------------------------

        taskModel = new DefaultListModel<>();

        taskList = new JList<>(taskModel);

        taskList.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION
        );

        // Add scrollbar
        JScrollPane scrollPane = new JScrollPane(taskList);

        // -------------------------
        // DELETE BUTTON
        // -------------------------

        deleteButton = new JButton("Delete Selected Task");

        // -------------------------
        // ADD EVERYTHING TO FRAME
        // -------------------------

        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(deleteButton, BorderLayout.SOUTH);

        add(mainPanel);

       
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });

       
        taskField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteTask();
            }
        });
    }



    private void addTask() {

        String task = taskField.getText().trim();

        if (!task.isEmpty()) {

            taskModel.addElement(task);

            taskField.setText("");

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Please enter a task.",
                    "Empty Task",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }

    private void deleteTask() {

        int selectedIndex = taskList.getSelectedIndex();

        if (selectedIndex != -1) {

            taskModel.remove(selectedIndex);

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Please select a task to delete.",
                    "No Task Selected",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }

   
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                ToDo app = new ToDo();
                app.setVisible(true);

            }
        });
    }
}