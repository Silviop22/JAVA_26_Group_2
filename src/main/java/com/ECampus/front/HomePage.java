package com.ECampus.front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HomePage extends JFrame implements ActionListener {

    HomePage() {
        setSize(1550, 850);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/oto.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JMenuBar b = new JMenuBar();
        //New Information
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        b.add(newInformation);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Info");
        facultyInfo.setBackground(Color.white);
        newInformation.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Info");
        facultyInfo.setBackground(Color.white);
        newInformation.add(studentInfo);
        //Schedule
        JMenu schedule = new JMenu("Schedule");
        schedule.setForeground(Color.PINK);
        b.add(schedule);

        JMenuItem schoolScheduleInfo = new JMenuItem("School Schedule Info");
        schoolScheduleInfo.setBackground(Color.white);
        schedule.add(schoolScheduleInfo);

        //Detalis
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.GREEN);
        b.add(details);

        JMenuItem schoolYear = new JMenuItem("What school year are you in?");
        schoolYear.setBackground(Color.white);
        details.add(schoolYear);

        JMenuItem studyFields = new JMenuItem("Study Fields");
        studyFields.setBackground(Color.white);
        details.add(studyFields);

        JMenuItem groupNumber = new JMenuItem("Group Number");
        groupNumber.setBackground(Color.white);
        details.add(groupNumber);

        //note prezent
        JMenu absences = new JMenu("Absences");
        absences.setForeground(Color.ORANGE);
        b.add(absences);

        JMenuItem noteProzent = new JMenuItem("Presence Information");
        noteProzent.setBackground(Color.white);
        absences.add(noteProzent);

        // Grading
        JMenu grading = new JMenu("Grading");
        grading.setForeground(Color.RED);
        b.add(grading);

        JMenuItem gradingInfo = new JMenuItem("Your grades for the relevant subjects!");
        gradingInfo.setBackground(Color.white);
        grading.add(gradingInfo);

        //Exams
        JMenu exams = new JMenu("Examination");
        exams.setForeground(Color.gray);
        b.add(exams);

        JMenuItem examinationDetails = new JMenuItem("Examination Results");
        examinationDetails.setBackground(Color.white);
        examinationDetails.addActionListener(this);
        exams.add(examinationDetails);

        JMenuItem examDates = new JMenuItem("Exam Dates");
        examDates.setBackground(Color.white);
        examDates.addActionListener(this);
        exams.add(examDates);


        //exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.magenta);
        b.add(exit);

        JMenuItem e = new JMenuItem("Exit");
        e.setBackground(Color.white);
        e.addActionListener(this);
        exit.add(e);


        setJMenuBar(b);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String message = actionEvent.getActionCommand();

        if (message.equals("Exit")) {
            setVisible(false);

        }

    }

    public static void main(String[] args) {
        new HomePage();
    }
}