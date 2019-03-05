

input = JOptionPane.showInputDialog("Enter a number " + 
 "in the range of 1 through 100."); 
 number = Integer.parseInt(input);
 
  // Validate the input. 
  while (number < 1 || number > 100)
   { 
    input = JOptionPane.showInputDialog("Invalid input. " +                 
    
          "Enter a number in the range of " +                    
          
             "1 through 100."); 
             number = Integer.parseInt(input); } 