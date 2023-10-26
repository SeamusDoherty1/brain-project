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
    //console.setImage("");

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
    console.setImage("parietal_Lobe.jpg");
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Parietal Lobe\n");
    System.out.println("A part of the brain necessary for the collection of sensory information, such as sound, smell, touch, and taste, which interprets and assembles these inputs.\n it can be affected by Agraphia (inability to write), Acalculia(inability to do math), Alexia(inability to read).");
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
    console.setImage("frontal_Lobe.jpg");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Frontal Lobe\n");
    System.out.println("Located in the front of the brain, the frontal lobe is a vital part of the brain's structure that is responsible for one's thoughts, movements and memory, as well as other social processes such as speech. \n It can be affected by dementia(impaired ability to think), strokes(occurring when something blocks the blood supply), or brain tumors(a growth of cells in the brain).");
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
    console.setImage("occipital_Lobe.jpg");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Occipital Lobe\n");
    System.out.println("A part of the brain located in its rear. This part is particularly important for functions related to sight, and damage of the lobe can result in blindness\n It can be affected by trauma, tumors, and autoimmune diseases.");
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
    console.setImage("temporal_Lobe.jpg");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Temporal Lobe\n");
    System.out.println("Located in the bottom center of the brain, the temporal lobe is spread throughout the left and right hemispheres of the brain and is responsible for the interpretation of language, emotions, memories, and senses.\n It can be affected by Alzheimer’s disease(memory loss and loss of ability of conversation) and Brain Lesions(damage to the brain tissue).");
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
    console.setImage("Medulla.jpg");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Medulla\n");
    System.out.println("Located in the bottom center of the brain, the temporal lobe is spread throughout the left and right hemispheres of the brain and is responsible for the interpretation of language, emotions, memories, and senses.\n This can be affected by Wallenberg syndrome(a condition caused by strokes, that can happen in one of the arteries that provides blood to the cerebellum)");
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
    boolean proceed = true;
    String input;
    // change image
    // ADD CODE HERE
    console.setImage("corpus_Callosum.jpg");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Corpus Callosum\n");
    System.out.println("A group of nerve fibers connecting the two hemispheres of the brain that serves to allow communication between them.\n It can be affected by Agenesis(a brain disorder in which the tissue that connects the left and right side of the brain is partially missing.).");
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
  private void cerebellum()
  {
    boolean proceed = true;
    String input;
    // change image
    // ADD CODE HERE
    console.setImage("Cerebellum.jpg");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Cerebellum\n");
    System.out.println("A part of the brain adjacent to the spinal cord that regulates balance and muscle control as a person performs movements.\n It can be affected by Cerebellar dysfunction(this causes balance problems and gait disorders along with difficulties.).");
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
  private void limbic_System()
  {
    boolean proceed = true;
    String input;
    // change image
    // ADD CODE HERE
    console.setImage("limbic_System.jpg");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Limbic System\n");
    System.out.println("A group of components in the brain dedicated to behavior and emotional responses. Included in this group of components are the cingulate gyrus, basal ganglia, thalamus, hypothalamus, amygdala, and hippocampus.\n it can be affected by PTSD(Post Traumatic Stress Disorder), substance abuse and dependence.");
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
  private void thalamus()
  {
    boolean proceed = true;
    String input;
    // change image
    // ADD CODE HERE
    console.setImage("Thalamus.jpg");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Thalamus\n");
    System.out.println("A spherical structure in the middle of the brain which communicates motor movement with the body.\n It can be affected by unconsciousness and sometimes comas, Sleep Disorders(insomnia and fatal familial insomnia).");
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
  private void hypothalamus()
  {
    boolean proceed = true;
    String input;
    // change image
    // ADD CODE HERE
    console.setImage("hypothalamus.jpg");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Hypothalamus\n");
    System.out.println("A part that manages the body temp, hunger, mood, blood pressure, and sleep.\n it can be affected by hypothalamic obesity(occasionally develops in response to major hypothalamic injury).");
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
  private void amygdala()
  {
    boolean proceed = true;
    String input;
    // change image
    // ADD CODE HERE
    console.setImage("Amygdala.jpg");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Amygdala\n");
    System.out.println("This part helps with regulating autonomic and endocrine functions, decision-making and adaptations of instinctive and motivational behaviors.\n It can be affected by Alzheimer's disease and can cause atrophy of the amygdala.");
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
  private void hippocampus()
  {
    boolean proceed = true;
    String input;
    // change image
    // ADD CODE HERE
    console.setImage("hippocampus.jpg");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Hippocampus\n");
    System.out.println("This part of the brain is involved with long-term memory formation and memory retrieval. It's also spatial memory.\n It can be affected by a loss of memory and a loss of the ability to make new, long-term memories.");
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
  private void reticular_Formation()
  {
    boolean proceed = true;
    String input;
    // change image
    // ADD CODE HERE
    console.setImage("reticular_Formation.jpg");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("The Reticular Formation\n");
    System.out.println("This part is a brainstem that subserves autonomic, motor, sensory, behavioral, cognitive, and mood-related functions.\n It can be affected by wake-sleep disturbances, reflex hyperactivity, and decreased P50 potential habituation.");
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
  private void wernickes_Area()
  {
    boolean proceed = true;
    String input;
    // change image
    // ADD CODE HERE
    console.setImage("wernickes_Area.jpg");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("Wernicke's Area\n");
    System.out.println("A spherical structure in the middle of the brain which communicates motor movement with the body.\n It can be affected by traumatic brain injury, strokes, brain tumors, and other neurological disorders.");
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

  private void brocas_Area()
  {
    String input;
    boolean proceed = true;
    // change image
    // ADD CODE HERE
    console.setImage("brocas_Area.jpg");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("Broca's Area\n");
    System.out.println("A spherical structure in the middle of the brain which communicates motor movement with the body.\n It can be affected by stroke, traumatic brain injury, tumors, and brain infections.");
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
}