import java.util.*;

public class brainProject 
{
  FancyConsole console;
  Scanner inScanner;

  public brainProject()
  {
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
  }

  public void play()
  {
    boolean proceed = true;
    String input;
    // start of adventure. You can change this if you like
    console.setImage("");

    // ask the user to input the brain part
    System.out.println("this is the brain. it helps us function and is helpful with our psychological needs. \n please type in the number corresponding with the part of the brain.");
    System.out.println("1. Parietal Lobe");
    System.out.println("2. Frontal Lobe");
    System.out.println("3. Occipital Lobe");
    System.out.println("4. Temporal Lobe");
    System.out.println("5. Medulla");
    System.out.println("6. Corpus Callosum");
    System.out.println("7. Cerebellum");
    System.out.println("8. Limbic System");
    System.out.println("9. Thalamus");
    System.out.println("10. Hypothalamus");
    System.out.println("11. Amygdala");
    System.out.println("12. Hippocampus");
    System.out.println("13. Reticular Formation/Reticular Activating System");
    System.out.println("14. Wenicke's Area");
    System.out.println("15. Broca's Area\n");
    input = inScanner.nextLine();

    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE
    while(proceed != false){
      if(input.equals("1") == true){ 
        parietal_Lobe();
        proceed = false;
      }
      else if(input.equals("2") == true){
        frontal_Lobe();
        proceed = false;
      }
      else if(input.equals("3") == true){
        occipital_Lobe();
        proceed = false;
      }
      else if(input.equals("4") == true){
        temporal_Lobe();
        proceed = false;
      }
      else if(input.equals("5") == true){
        medulla();
        proceed = false;
      }
      else if(input.equals("6") == true){
        corpus_Callosum();
        proceed = false;
      }
      else if(input.equals("7") == true){
        cerebellum();
        proceed = false;
      }
      else if(input.equals("8") == true){
        limbic_System();
        proceed = false;
      }
      
      else if(input.equals("9") == true){
        thalamus();
        proceed = false;
      }
      else if(input.equals("10") == true){
        hypothalamus();
        proceed = false;
      }
      else if(input.equals("11") == true){
        amygdala();
        proceed = false;
      }
      else if(input.equals("12") == true){
        hippocampus();
        proceed = false;
      }
      else if(input.equals("13") == true){
        reticular_Formation();
        proceed = false;
      }
      else if(input.equals("14") == true){
        wernickes_Area();
        proceed = false;
      }
      else if(input.equals("15") == true){
        brocas_Area();
        proceed = false;
      }
      else{
        System.out.println("sorry that was not one of the options \n try again\n");
        input = inScanner.nextLine();
      }
    }
  }

  private void parietal_Lobe()
  {
    String input;
    boolean proceed = true;
    // change image
    console.setImage("");
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Parietal Lobe\n");
    System.out.println("A part of the brain necessary for the collection of sensory information, such as sound, smell, touch, and taste, which interprets and assembles these inputs. ");
    System.out.println("please type in the number corresponding with the part of the brain.");
    System.out.println("1. Parietal Lobe");
    System.out.println("2. Frontal Lobe");
    System.out.println("3. Occipital Lobe");
    System.out.println("4. Temporal Lobe");
    System.out.println("5. Medulla");
    System.out.println("6. Corpus Callosum");
    System.out.println("7. Cerebellum");
    System.out.println("8. Limbic System");
    System.out.println("9. Thalamus");
    System.out.println("10. Hypothalamus");
    System.out.println("11. Amygdala");
    System.out.println("12. Hippocampus");
    System.out.println("13. Reticular Formation/Reticular Activating System");
    System.out.println("14. Wenicke's Area");
    System.out.println("15. Broca's Area\n");
    input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    while(proceed != false){
      if(input.equals("1") == true){ 
        parietal_Lobe();
        proceed = false;
      }
      else if(input.equals("2") == true){
        frontal_Lobe();
        proceed = false;
      }
      else if(input.equals("3") == true){
        occipital_Lobe();
        proceed = false;
      }
      else if(input.equals("4") == true){
        temporal_Lobe();
        proceed = false;
      }
      else if(input.equals("5") == true){
        medulla();
        proceed = false;
      }
      else if(input.equals("6") == true){
        corpus_Callosum();
        proceed = false;
      }
      else if(input.equals("7") == true){
        cerebellum();
        proceed = false;
      }
      else if(input.equals("8") == true){
        limbic_System();
        proceed = false;
      }
      
      else if(input.equals("9") == true){
        thalamus();
        proceed = false;
      }
      else if(input.equals("10") == true){
        hypothalamus();
        proceed = false;
      }
      else if(input.equals("11") == true){
        amygdala();
        proceed = false;
      }
      else if(input.equals("12") == true){
        hippocampus();
        proceed = false;
      }
      else if(input.equals("13") == true){
        reticular_Formation();
        proceed = false;
      }
      else if(input.equals("14") == true){
        wernickes_Area();
        proceed = false;
      }
      else if(input.equals("15") == true){
        brocas_Area();
        proceed = false;
      }
      else{
        System.out.println("sorry that was not one of the options \n try again\n");
        input = inScanner.nextLine();
      }
    }

  }

  private void frontal_Lobe()
  {
    String input;
    boolean proceed = true;
    // change image
    // ADD CODE HERE
    console.setImage("");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Frontal Lobe\n");
    System.out.println("Located in the front of the brain, the frontal lobe is a vital part of the brain's structure that is responsible for one's thoughts, movements and memory, as well as other social processes such as speech.");
    System.out.println("please type in the number corresponding with the part of the brain.");
    System.out.println("1. Parietal Lobe");
    System.out.println("2. Frontal Lobe");
    System.out.println("3. Occipital Lobe");
    System.out.println("4. Temporal Lobe");
    System.out.println("5. Medulla");
    System.out.println("6. Corpus Callosum");
    System.out.println("7. Cerebellum");
    System.out.println("8. Limbic System");
    System.out.println("9. Thalamus");
    System.out.println("10. Hypothalamus");
    System.out.println("11. Amygdala");
    System.out.println("12. Hippocampus");
    System.out.println("13. Reticular Formation/Reticular Activating System");
    System.out.println("14. Wenicke's Area");
    System.out.println("15. Broca's Area\n");
    input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    while(proceed != false){
      if(input.equals("1") == true){ 
        parietal_Lobe();
        proceed = false;
      }
      else if(input.equals("2") == true){
        frontal_Lobe();
        proceed = false;
      }
      else if(input.equals("3") == true){
        occipital_Lobe();
        proceed = false;
      }
      else if(input.equals("4") == true){
        temporal_Lobe();
        proceed = false;
      }
      else if(input.equals("5") == true){
        medulla();
        proceed = false;
      }
      else if(input.equals("6") == true){
        corpus_Callosum();
        proceed = false;
      }
      else if(input.equals("7") == true){
        cerebellum();
        proceed = false;
      }
      else if(input.equals("8") == true){
        limbic_System();
        proceed = false;
      }
      
      else if(input.equals("9") == true){
        thalamus();
        proceed = false;
      }
      else if(input.equals("10") == true){
        hypothalamus();
        proceed = false;
      }
      else if(input.equals("11") == true){
        amygdala();
        proceed = false;
      }
      else if(input.equals("12") == true){
        hippocampus();
        proceed = false;
      }
      else if(input.equals("13") == true){
        reticular_Formation();
        proceed = false;
      }
      else if(input.equals("14") == true){
        wernickes_Area();
        proceed = false;
      }
      else if(input.equals("15") == true){
        brocas_Area();
        proceed = false;
      }
      else{
        System.out.println("sorry that was not one of the options \n try again\n");
        input = inScanner.nextLine();
      }
    }
    
  }

  private void occipital_Lobe()
  {
    String input;
    boolean proceed = true;
    // change image
    // ADD CODE HERE
    console.setImage("");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Occipital Lobe\n");
    System.out.println("A part of the brain located in its rear. This part is particularly important for functions related to sight, and damage of the lobe can result in blindness");
    System.out.println("please type in the number corresponding with the part of the brain.");
    System.out.println("1. Parietal Lobe");
    System.out.println("2. Frontal Lobe");
    System.out.println("3. Occipital Lobe");
    System.out.println("4. Temporal Lobe");
    System.out.println("5. Medulla");
    System.out.println("6. Corpus Callosum");
    System.out.println("7. Cerebellum");
    System.out.println("8. Limbic System");
    System.out.println("9. Thalamus");
    System.out.println("10. Hypothalamus");
    System.out.println("11. Amygdala");
    System.out.println("12. Hippocampus");
    System.out.println("13. Reticular Formation/Reticular Activating System");
    System.out.println("14. Wenicke's Area");
    System.out.println("15. Broca's Area\n");
    input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    while(proceed != false){
      if(input.equals("1") == true){ 
        parietal_Lobe();
        proceed = false;
      }
      else if(input.equals("2") == true){
        frontal_Lobe();
        proceed = false;
      }
      else if(input.equals("3") == true){
        occipital_Lobe();
        proceed = false;
      }
      else if(input.equals("4") == true){
        temporal_Lobe();
        proceed = false;
      }
      else if(input.equals("5") == true){
        medulla();
        proceed = false;
      }
      else if(input.equals("6") == true){
        corpus_Callosum();
        proceed = false;
      }
      else if(input.equals("7") == true){
        cerebellum();
        proceed = false;
      }
      else if(input.equals("8") == true){
        limbic_System();
        proceed = false;
      }
      
      else if(input.equals("9") == true){
        thalamus();
        proceed = false;
      }
      else if(input.equals("10") == true){
        hypothalamus();
        proceed = false;
      }
      else if(input.equals("11") == true){
        amygdala();
        proceed = false;
      }
      else if(input.equals("12") == true){
        hippocampus();
        proceed = false;
      }
      else if(input.equals("13") == true){
        reticular_Formation();
        proceed = false;
      }
      else if(input.equals("14") == true){
        wernickes_Area();
        proceed = false;
      }
      else if(input.equals("15") == true){
        brocas_Area();
        proceed = false;
      }
      else{
        System.out.println("sorry that was not one of the options \n try again\n");
        input = inScanner.nextLine();
      }
    }

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void temporal_Lobe()
  {
    String input;
    boolean proceed = true;
    // change image
    // ADD CODE HERE
    console.setImage("");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Temporal Lobe\n");
    System.out.println("Located in the bottom center of the brain, the temporal lobe is spread throughout the left and right hemispheres of the brain and is responsible for the interpretation of language, emotions, memories, and senses. ");
    System.out.println("please type in the number corresponding with the part of the brain.");
    System.out.println("1. Parietal Lobe");
    System.out.println("2. Frontal Lobe");
    System.out.println("3. Occipital Lobe");
    System.out.println("4. Temporal Lobe");
    System.out.println("5. Medulla");
    System.out.println("6. Corpus Callosum");
    System.out.println("7. Cerebellum");
    System.out.println("8. Limbic System");
    System.out.println("9. Thalamus");
    System.out.println("10. Hypothalamus");
    System.out.println("11. Amygdala");
    System.out.println("12. Hippocampus");
    System.out.println("13. Reticular Formation/Reticular Activating System");
    System.out.println("14. Wenicke's Area");
    System.out.println("15. Broca's Area\n");
    input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    while(proceed != false){
      if(input.equals("1") == true){ 
        parietal_Lobe();
        proceed = false;
      }
      else if(input.equals("2") == true){
        frontal_Lobe();
        proceed = false;
      }
      else if(input.equals("3") == true){
        occipital_Lobe();
        proceed = false;
      }
      else if(input.equals("4") == true){
        temporal_Lobe();
        proceed = false;
      }
      else if(input.equals("5") == true){
        medulla();
        proceed = false;
      }
      else if(input.equals("6") == true){
        corpus_Callosum();
        proceed = false;
      }
      else if(input.equals("7") == true){
        cerebellum();
        proceed = false;
      }
      else if(input.equals("8") == true){
        limbic_System();
        proceed = false;
      }
      
      else if(input.equals("9") == true){
        thalamus();
        proceed = false;
      }
      else if(input.equals("10") == true){
        hypothalamus();
        proceed = false;
      }
      else if(input.equals("11") == true){
        amygdala();
        proceed = false;
      }
      else if(input.equals("12") == true){
        hippocampus();
        proceed = false;
      }
      else if(input.equals("13") == true){
        reticular_Formation();
        proceed = false;
      }
      else if(input.equals("14") == true){
        wernickes_Area();
        proceed = false;
      }
      else if(input.equals("15") == true){
        brocas_Area();
        proceed = false;
      }
      else{
        System.out.println("sorry that was not one of the options \n try again\n");
        input = inScanner.nextLine();
      }
    }
    
  }

  private void medulla()
  {
    boolean proceed = true;
    String input;
    // change image
    // ADD CODE HERE
    console.setImage("");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Medulla\n");
    System.out.println("Located in the bottom center of the brain, the temporal lobe is spread throughout the left and right hemispheres of the brain and is responsible for the interpretation of language, emotions, memories, and senses. ");
    System.out.println("please type in the number corresponding with the part of the brain.");
    System.out.println("1. Parietal Lobe");
    System.out.println("2. Frontal Lobe");
    System.out.println("3. Occipital Lobe");
    System.out.println("4. Temporal Lobe");
    System.out.println("5. Medulla");
    System.out.println("6. Corpus Callosum");
    System.out.println("7. Cerebellum");
    System.out.println("8. Limbic System");
    System.out.println("9. Thalamus");
    System.out.println("10. Hypothalamus");
    System.out.println("11. Amygdala");
    System.out.println("12. Hippocampus");
    System.out.println("13. Reticular Formation/Reticular Activating System");
    System.out.println("14. Wenicke's Area");
    System.out.println("15. Broca's Area\n");
    input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    while(proceed != false){
      if(input.equals("1") == true){ 
        parietal_Lobe();
        proceed = false;
      }
      else if(input.equals("2") == true){
        frontal_Lobe();
        proceed = false;
      }
      else if(input.equals("3") == true){
        occipital_Lobe();
        proceed = false;
      }
      else if(input.equals("4") == true){
        temporal_Lobe();
        proceed = false;
      }
      else if(input.equals("5") == true){
        medulla();
        proceed = false;
      }
      else if(input.equals("6") == true){
        corpus_Callosum();
        proceed = false;
      }
      else if(input.equals("7") == true){
        cerebellum();
        proceed = false;
      }
      else if(input.equals("8") == true){
        limbic_System();
        proceed = false;
      }
      
      else if(input.equals("9") == true){
        thalamus();
        proceed = false;
      }
      else if(input.equals("10") == true){
        hypothalamus();
        proceed = false;
      }
      else if(input.equals("11") == true){
        amygdala();
        proceed = false;
      }
      else if(input.equals("12") == true){
        hippocampus();
        proceed = false;
      }
      else if(input.equals("13") == true){
        reticular_Formation();
        proceed = false;
      }
      else if(input.equals("14") == true){
        wernickes_Area();
        proceed = false;
      }
      else if(input.equals("15") == true){
        brocas_Area();
        proceed = false;
      }
      else{
        System.out.println("sorry that was not one of the options \n try again\n");
        input = inScanner.nextLine();
      }
    }

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }
  private void corpus_Callosum()
  {
    // change image
    // ADD CODE HERE
    console.setImage("");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("you have collected 10 gold pieces and hoped you had gotten more.\n but maybe it was the friends we did not make on the way that was the not real treasure");
    gameEnd();

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }
  private void cerebellum()
  {
    // change image
    // ADD CODE HERE
    console.setImage("");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("you have collected 10 gold pieces and hoped you had gotten more.\n but maybe it was the friends we did not make on the way that was the not real treasure");
    gameEnd();

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }
  private void limbic_System()
  {
    // change image
    // ADD CODE HERE
    console.setImage("");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("you have collected 10 gold pieces and hoped you had gotten more.\n but maybe it was the friends we did not make on the way that was the not real treasure");
    gameEnd();

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }
  private void thalamus()
  {
    // change image
    // ADD CODE HERE
    console.setImage("");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("you have collected 10 gold pieces and hoped you had gotten more.\n but maybe it was the friends we did not make on the way that was the not real treasure");
    gameEnd();

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }
  private void hypothalamus()
  {
    // change image
    // ADD CODE HERE
    console.setImage("");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("you have collected 10 gold pieces and hoped you had gotten more.\n but maybe it was the friends we did not make on the way that was the not real treasure");
    gameEnd();

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }
  private void amygdala()
  {
    // change image
    // ADD CODE HERE
    console.setImage("");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("you have collected 10 gold pieces and hoped you had gotten more.\n but maybe it was the friends we did not make on the way that was the not real treasure");
    gameEnd();

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }
  private void hippocampus()
  {
    // change image
    // ADD CODE HERE
    console.setImage("");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("you have collected 10 gold pieces and hoped you had gotten more.\n but maybe it was the friends we did not make on the way that was the not real treasure");
    gameEnd();

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }
  private void reticular_Formation()
  {
    // change image
    // ADD CODE HERE
    console.setImage("");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("you have collected 10 gold pieces and hoped you had gotten more.\n but maybe it was the friends we did not make on the way that was the not real treasure");
    gameEnd();

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }
  private void wernickes_Area()
  {
    // change image
    // ADD CODE HERE
    console.setImage("");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("you have collected 10 gold pieces and hoped you had gotten more.\n but maybe it was the friends we did not make on the way that was the not real treasure");
    gameEnd();

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void brocas_Area()
  {
    String input;
    boolean proceed = true;
    int dragonHealth = 4;
    // change image
    // ADD CODE HERE
    console.setImage("");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The dragon has awakened and sees you as a threat.\n battle it for the treasure.\n type roll for damage");
    input = inScanner.nextLine();
    if(input.equals("roll") == true){
      int damage = (int) (Math.random() * 10);
      dragonHealth = dragonHealth - damage;
    }  
    if(dragonHealth <= 0 || input.equals("gtfo") == true){
      System.out.print("the dragon gives up and decides to let you have the gold\n");
      gameEnd();
    }
    else{
      System.out.println("you failed to defeat the dragon and died");
      gameEnd();
    }


    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void gameEnd()
  {
    // ADD CODE HERE
    console.setImage("");
    System.out.println("Thank you for playing");
    inScanner.close();
  }
}