/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.week.lab.activity1;

/**
 *
 * @author Sound Room
 */
public class LibraryGUI extends javax.swing.JFrame {

    //create library object
    Library myLibrary;

    //library array creation with an initial length of 9 just so we have a base library to play around with
    Book[] libraryBooks;

    /**
     * Creates new form LibraryGUI
     */
    public LibraryGUI() {
        initComponents();

        libraryBooks = new Book[9];

        //book creation 
        Book book1 = new Book("1984", "George Orwell", false);
        Book book2 = new Book("Jane Eyre", "Charlotte Bronte", false);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", false);
        Book book4 = new Book("Little Women", "Louisa May Alcott", false);
        Book book5 = new Book("Pride and Prejudice", "Jane Austen", false);
        Book book6 = new Book("Around the Table", "Jonathan Case", false);
        Book book7 = new Book("Animal Farm", "George Orwell", false);
        Book book8 = new Book("Burmese Days", "George Orwell", false);
        Book book9 = new Book("Homage to Catalonia", "George Orwell", false);

        //fill the array
        libraryBooks[0] = book1;
        libraryBooks[1] = book2;
        libraryBooks[2] = book3;
        libraryBooks[3] = book4;
        libraryBooks[4] = book5;
        libraryBooks[5] = book6;
        libraryBooks[6] = book7;
        libraryBooks[7] = book8;
        libraryBooks[8] = book9;

        myLibrary = new Library(libraryBooks);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LabelLibrary = new javax.swing.JLabel();
        LabelAsk = new javax.swing.JLabel();
        TextFieldBookTitle = new javax.swing.JTextField();
        ButtonBorrow = new javax.swing.JButton();
        ButtonReturn = new javax.swing.JButton();
        ButtonSearchTitle = new javax.swing.JButton();
        ButtonSearchAuthor = new javax.swing.JButton();
        ButtonInventory = new javax.swing.JButton();
        ButtonQuit = new javax.swing.JButton();
        ButtonListAllBooks = new javax.swing.JButton();
        LabelAdd = new javax.swing.JLabel();
        LabelTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TextFieldAuthorToAdd = new javax.swing.JTextField();
        ButtonAddBook = new javax.swing.JButton();
        LabelAnnouncement2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        TextFieldTitle = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        LabelLibrary.setFont(new java.awt.Font("Source Serif Pro Black", 1, 24)); // NOI18N
        LabelLibrary.setForeground(new java.awt.Color(255, 255, 255));
        LabelLibrary.setText("Library");
        LabelLibrary.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LabelLibrary.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(LabelLibrary, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        LabelAsk.setBackground(new java.awt.Color(0, 0, 0));
        LabelAsk.setForeground(new java.awt.Color(255, 255, 255));
        LabelAsk.setText("To Borrow, Return, or Search, enter the Title or Author name here:");

        TextFieldBookTitle.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldBookTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldBookTitleActionPerformed(evt);
            }
        });

        ButtonBorrow.setText("Borrow");
        ButtonBorrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonBorrowMouseClicked(evt);
            }
        });
        ButtonBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBorrowActionPerformed(evt);
            }
        });

        ButtonReturn.setText("Return");
        ButtonReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonReturnMouseClicked(evt);
            }
        });
        ButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReturnActionPerformed(evt);
            }
        });

        ButtonSearchTitle.setText("Search Title");
        ButtonSearchTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSearchTitleMouseClicked(evt);
            }
        });

        ButtonSearchAuthor.setText("Search Author");
        ButtonSearchAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSearchAuthorMouseClicked(evt);
            }
        });
        ButtonSearchAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchAuthorActionPerformed(evt);
            }
        });

        ButtonInventory.setText("Check Availability");
        ButtonInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonInventoryMouseClicked(evt);
            }
        });

        ButtonQuit.setText("Quit");
        ButtonQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonQuitMouseClicked(evt);
            }
        });
        ButtonQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonQuitActionPerformed(evt);
            }
        });

        ButtonListAllBooks.setText("List All Books");
        ButtonListAllBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonListAllBooksMouseClicked(evt);
            }
        });
        ButtonListAllBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonListAllBooksActionPerformed(evt);
            }
        });

        LabelAdd.setForeground(new java.awt.Color(255, 255, 255));
        LabelAdd.setText("To Add a book to the inventory, enter the Title and Author here:");

        LabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitle.setText("Title:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Author:");

        TextFieldAuthorToAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAuthorToAddActionPerformed(evt);
            }
        });

        ButtonAddBook.setText("Add Book");
        ButtonAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddBookActionPerformed(evt);
            }
        });

        LabelAnnouncement2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelAnnouncement2.setForeground(new java.awt.Color(255, 255, 255));
        LabelAnnouncement2.setText("    ");

        TextArea.setColumns(20);
        TextArea.setForeground(new java.awt.Color(0, 0, 0));
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ButtonAddBook)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelAnnouncement2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(TextFieldBookTitle, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LabelAsk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ButtonBorrow)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ButtonReturn))
                                .addComponent(ButtonInventory))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ButtonListAllBooks)
                                    .addGap(14, 14, 14))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(ButtonSearchTitle)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ButtonSearchAuthor)
                                .addComponent(ButtonQuit)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldAuthorToAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelAsk)
                .addGap(18, 18, 18)
                .addComponent(TextFieldBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBorrow)
                    .addComponent(ButtonReturn)
                    .addComponent(ButtonSearchTitle)
                    .addComponent(ButtonSearchAuthor))
                .addGap(46, 46, 46)
                .addComponent(LabelAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldAuthorToAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(LabelTitle)
                    .addComponent(TextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LabelAnnouncement2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonAddBook)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonInventory)
                    .addComponent(ButtonQuit)
                    .addComponent(ButtonListAllBooks))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldBookTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldBookTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldBookTitleActionPerformed

    private void ButtonBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBorrowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonBorrowActionPerformed

    private void ButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonReturnActionPerformed

    private void ButtonQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonQuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonQuitActionPerformed

    private void ButtonSearchAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSearchAuthorActionPerformed

    private void ButtonQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonQuitMouseClicked
        // TODO add your handling code here:

        //if they quit we close the program
        this.dispose();

    }//GEN-LAST:event_ButtonQuitMouseClicked

    private void ButtonListAllBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonListAllBooksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonListAllBooksActionPerformed

    private void ButtonBorrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBorrowMouseClicked

        //borrow book if we can
        if (myLibrary.borrowBook(TextFieldBookTitle.getText()) == true) {
            TextArea.setText(TextFieldBookTitle.getText() + " has been borrowed.");
        } else {
            TextArea.setText(TextFieldBookTitle.getText() + " is checked out or not available here.");
        }

        //make the text unchangeable
        TextArea.setEnabled(false);


    }//GEN-LAST:event_ButtonBorrowMouseClicked

    private void TextFieldAuthorToAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAuthorToAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAuthorToAddActionPerformed

    private void ButtonAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddBookActionPerformed

        Book newBook = new Book(TextFieldTitle.getText(), TextFieldAuthorToAdd.getText(), false);

        myLibrary.addBook(newBook);

        //say it has been added
        TextArea.setText(TextFieldTitle.getText() + " by " + TextFieldAuthorToAdd.getText() + " has been added to the library.");

        //make the text unchangeable
        TextArea.setEnabled(false);
    }//GEN-LAST:event_ButtonAddBookActionPerformed

    private void ButtonReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonReturnMouseClicked

        //return book if we can
        if (myLibrary.returnBook(TextFieldBookTitle.getText()) == true) {
            TextArea.setText(TextFieldBookTitle.getText() + " has been returned.");
        } else {
            TextArea.setText(TextFieldBookTitle.getText() + " is already returned or does not belong here.");
        }

        //make the text unchangeable
        TextArea.setEnabled(false);

    }//GEN-LAST:event_ButtonReturnMouseClicked

    private void ButtonInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInventoryMouseClicked

        //call inventory checker
        TextArea.setText("There are " + myLibrary.countAvailableBooks() + " books available for checkout in this library.");

        //make the text unchangeable
        TextArea.setEnabled(false);

        //make the text unchangeable
        TextArea.setEnabled(false);


    }//GEN-LAST:event_ButtonInventoryMouseClicked

    private void ButtonListAllBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonListAllBooksMouseClicked

        TextArea.setText(myLibrary.listBooks());

        //make the text unchangeable
        TextArea.setEnabled(false);


    }//GEN-LAST:event_ButtonListAllBooksMouseClicked

    private void ButtonSearchTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSearchTitleMouseClicked

        if (myLibrary.searchByTitle(TextFieldBookTitle.getText()) != null) {
            TextArea.setText("Book found:\n    " + myLibrary.searchByTitle(TextFieldBookTitle.getText()).toString());

        } else {

            TextArea.setText(TextFieldBookTitle.getText() + " was not found in this library.");

        }

        //make the text unchangeable
        TextArea.setEnabled(false);


    }//GEN-LAST:event_ButtonSearchTitleMouseClicked

    private void ButtonSearchAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSearchAuthorMouseClicked

        TextArea.setText("Books by " + TextFieldBookTitle.getText() + ":" + myLibrary.searchByAuthor(TextFieldBookTitle.getText()));

        //make the text unchangeable
        TextArea.setEnabled(false);

    }//GEN-LAST:event_ButtonSearchAuthorMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryGUI().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAddBook;
    private javax.swing.JButton ButtonBorrow;
    private javax.swing.JButton ButtonInventory;
    private javax.swing.JButton ButtonListAllBooks;
    private javax.swing.JButton ButtonQuit;
    private javax.swing.JButton ButtonReturn;
    private javax.swing.JButton ButtonSearchAuthor;
    private javax.swing.JButton ButtonSearchTitle;
    private javax.swing.JLabel LabelAdd;
    private javax.swing.JLabel LabelAnnouncement2;
    private javax.swing.JLabel LabelAsk;
    private javax.swing.JLabel LabelLibrary;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JTextField TextFieldAuthorToAdd;
    private javax.swing.JTextField TextFieldBookTitle;
    private javax.swing.JTextField TextFieldTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
