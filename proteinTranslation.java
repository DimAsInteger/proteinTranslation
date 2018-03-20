package proteinTranslation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class proteinTranslation {
    public static void main(String args[]) throws FileNotFoundException {
 
        File importText = new File("path/to/test.fasta"); //NOTE: INSERT FILEPATH
        Scanner importSeq = new Scanner(importText);
        
			ArrayList<String> longString = new ArrayList<String>();

			int lineNum = 1; 
        
        		while(importSeq.hasNextLine()){
        				String line = importSeq.nextLine();
        				longString.add(line);
        				System.out.println("RNA Sequence: \n" + line);
        				System.out.println("\n" + "RNA Sequence Length: " + line.length());
        				lineNum++;
        		
        							String frame1 = line;
        							String frame2 = line.substring(1); //remove 0 element
        							String frame3 = line.substring(2); //remove 0 element
        							
        							System.out.println("Reading Frame 1: " + frame1);
        							System.out.println("Reading Frame 2: " + frame2);
        							System.out.println("Reading Frame 3: " + frame3 + "\n");
        		 
        										String codons1 = frame1.replaceAll("\\s*(..[^ ])\\s*", "$1 "); //split string frame1 into codons
        										String codons2 = frame2.replaceAll("\\s*(..[^ ])\\s*", "$1 "); //split string frame2 into codons
        										String codons3 = frame3.replaceAll("\\s*(..[^ ])\\s*", "$1 "); //split string frame3 into codons
        										
        	        							System.out.println("Convert Reading Frame 1 To Codons: " + codons1);
        										System.out.println("Convert Reading Frame 1 To Codons: " + codons2);
        										System.out.println("Convert Reading Frame 1 To Codons: " + codons3);
        										
        														String [] f1 = codons1.split(" ");
        														String [] f2 = codons2.split(" ");
        														String [] f3 = codons3.split(" ");

        																	System.out.println("\nRNA Sequence Frame 1: ");
        														
        																			for (int data = 0; data < f1.length; data++) {
        																				System.out.print(f1[data] + " ");
        																			}
        																			System.out.print("\n");
        	 			
        		ascannerdarkly: for (int data = 0; data < f1.length; data++) {
        			    StringBuilder f1builder = new StringBuilder();
        			    
        			    switch (f1[data]) {
        			    
        			    case "GCT":
        			    case "GCC":
        			    case "GCA":
        			    case "GCG":
        			    	f1builder.append("A");
        			    break;
        			   
        			    case "CGT":
        			    case "CGC":
        			    case "CGA":
        			    case "CGG":
        			    case "AGA":
        			    case "AGG":
        			    	f1builder.append("R");
        			    break;

        			    case "AAT":
        			    case "AAC":
        			    	f1builder.append("N");
        			    break;
        			    
        			    case "GAT":
        			    case "GAC":
        			    	f1builder.append("D");
        			    break;
        			    
        			    case "TGT":
        			    case "TGC":
        			    	f1builder.append("C");
        			    break;
        			    
        			    case "CAA":
        			    case "CAG":
        			    	f1builder.append("Q");
        			    break;
        			    
        			    case "GAA":
        			    case "GAG":
        			    	f1builder.append("E");
        			    break;
        			    
        			    case "GGT":
        			    case "GGC":
        			    case "GGA":
        			    case "GGG":
        			    	f1builder.append("G");
        			    break;
        			    
        			    case "CAT":
        			    case "CAC":
        			    	f1builder.append("H");
        			    break;
        			    
        			    case "ATT":
        			    case "ATC":
        			    case "ATA":
        			    	f1builder.append("I");
        			    break;
        			    
        			    case "TTA":
        			    case "TTG":
        			    case "CTT":
        			    case "CTC":
        			    case "CTA":
        			    case "CTG":
        			    	f1builder.append("L");
        			    break;
        			    	
        			    case "AAA":
        			    case "AAG":
        			    	f1builder.append("K");
        			    break; 
        			    
        			    case "ATG":
        			    	f1builder.append("M");
        			    break;
        			    
        			    case "TTT":
        			    case "TTC":
        			    	f1builder.append("F");
        			    break; 

        			    case "CCT":
        			    case "CCC":
        			    case "CCA":
        			    case "CCG":

        			    	f1builder.append("P");
        			    break;

        			    case "TCT":
        			    case "TCC":
        			    case "TCA":
        			    case "TCG":
        			    case "AGT":
        			    case "AGC":
        			    	f1builder.append("S");
        			    break;
        			    
        			    case "ACT":
        			    case "ACC":
        			    case "ACA":
        			    case "ACG":
        			    	f1builder.append("T");
        			    break;
        			    
        			    case "TGG":
        			    	f1builder.append("W");
        			    break;
        			    
        			    case "TAT":
        			    case "TAC":
        			    	f1builder.append("Y");
        			    break;

        			    case "GTT":
        			    case "GTC":
        			    case "GTA":
        			    case "GTG":
        			    	f1builder.append("V");
        			    break;

        			    default:

        			    	break ascannerdarkly;
        			    }
        			    System.out.print(f1builder + "   ");
        			}
        			System.out.print(" (Amino Acid Consensus Sequence:  Origin RNA Sequence Frame 1)\n");
        			
        			
            	System.out.println("\nRNA Sequence Frame 2: ");
        		 	for (int data = 0; data < f2.length; data++) {
        		 		System.out.print(f2[data] + " ");
        		 	}
        		 		System.out.print("\n");
        			
        			ascannerclearly: for (int data = 0; data < f2.length; data++) {
        			    StringBuilder f2builder = new StringBuilder();
        			    
        			    switch (f2[data]) {
        			    case "GCT":
        			    case "GCC":
        			    case "GCA":
        			    case "GCG":
        			    	f2builder.append("A");
        			    break;
        			   
        			    case "CGT":
        			    case "CGC":
        			    case "CGA":
        			    case "CGG":
        			    case "AGA":
        			    case "AGG":
        			    	f2builder.append("R");
        			    break;

        			    case "AAT":
        			    case "AAC":
        			    	f2builder.append("N");
        			    break;
        			    
        			    case "GAT":
        			    case "GAC":
        			    	f2builder.append("D");
        			    break;
        			    
        			    case "TGT":
        			    case "TGC":
        			    	f2builder.append("C");
        			    break;
        			    
        			    case "CAA":
        			    case "CAG":
        			    	f2builder.append("Q");
        			    break;
        			    
        			    case "GAA":
        			    case "GAG":
        			    	f2builder.append("E");
        			    break;
        			    
        			    case "GGT":
        			    case "GGC":
        			    case "GGA":
        			    case "GGG":
        			    	f2builder.append("G");
        			    break;
        			    
        			    case "CAT":
        			    case "CAC":
        			    	f2builder.append("H");
        			    break;
        			    
        			    case "ATT":
        			    case "ATC":
        			    case "ATA":
        			    	f2builder.append("I");
        			    break;
        			    
        			    case "TTA":
        			    case "TTG":
        			    case "CTT":
        			    case "CTC":
        			    case "CTA":
        			    case "CTG":
        			    	f2builder.append("L");
        			    break;
        			    
        			    case "AAA":
        			    case "AAG":
        			    	f2builder.append("K");
        			    break; 
        			    
        			    case "ATG":
        			    	f2builder.append("M");
        			    break;
        			    
        			    case "TTT":
        			    case "TTC":
        			    	f2builder.append("F");
        			    break; 

        			    case "CCT":
        			    case "CCC":
        			    case "CCA":
        			    case "CCG":

        			    	f2builder.append("P");
        			    break;

        			    case "TCT":
        			    case "TCC":
        			    case "TCA":
        			    case "TCG":
        			    case "AGT":
        			    case "AGC":
        			    	f2builder.append("S");
        			    break;
        			    
        			    case "ACT":
        			    case "ACC":
        			    case "ACA":
        			    case "ACG":
        			    	f2builder.append("T");
        			    break;
        			    
        			    case "TGG":
        			    	f2builder.append("W");
        			    break;
        			    
        			    case "TAT":
        			    case "TAC":
        			    	f2builder.append("Y");
        			    break;

        			    case "GTT":
        			    case "GTC":
        			    case "GTA":
        			    case "GTG":
        			    	f2builder.append("V");
        			    break;
        			    
        			    default:
  
        			    	break ascannerclearly;
        			    }
        			    
        			    System.out.print(f2builder + "   ");
        			}
        			System.out.print(" (Amino Acid Consensus Sequence:  Origin RNA Sequence Frame 2)\n");
        	
        			
            System.out.println("\nRNA Sequence Frame 3: ");
        		 for (int data= 0; data< f3.length; data++) {
        		 	System.out.print(f3[data] + " ");
        		 }
        		 	System.out.print("\n");	
        			
        	ascannermurky: for (int data = 0; data < f3.length; data++) {
			    StringBuilder f3builder = new StringBuilder();
			    
			    switch (f3[data]) {
			    case "GCT":
			    case "GCC":
			    case "GCA":
			    case "GCG":
			    	f3builder.append("A");
			    break;
			   
			    case "CGT":
			    case "CGC":
			    case "CGA":
			    case "CGG":
			    case "AGA":
			    case "AGG":
			    	f3builder.append("R");
			    break;

			    case "AAT":
			    case "AAC":
			    	f3builder.append("N");
			    break;
			    
			    case "GAT":
			    case "GAC":
			    	f3builder.append("D");
			    break;
			    
			    case "TGT":
			    case "TGC":
			    	f3builder.append("C");
			    break;
			    
			    case "CAA":
			    case "CAG":
			    	f3builder.append("Q");
			    break;
			    
			    case "GAA":
			    case "GAG":
			    	f3builder.append("E");
			    break;
			    
			    case "GGT":
			    case "GGC":
			    case "GGA":
			    case "GGG":
			    	f3builder.append("G");
			    break;
			    
			    case "CAT":
			    case "CAC":
			    	f3builder.append("H");
			    break;
			    
			    case "ATT":
			    case "ATC":
			    case "ATA":
			    	f3builder.append("I");
			    break;
			    
			    case "TTA":
			    case "TTG":
			    case "CTT":
			    case "CTC":
			    case "CTA":
			    case "CTG":
			    	f3builder.append("L");
			    break;
			    
			    case "AAA":
			    case "AAG":
			    	f3builder.append("K");
			    break; 
			    
			    case "ATG":
			    	f3builder.append("M");
			    break;
			    
			    case "TTT":
			    case "TTC":
			    	f3builder.append("F");
			    break; 

			    case "CCT":
			    case "CCC":
			    case "CCA":
			    case "CCG":

			    	f3builder.append("P");
			    break;

			    case "TCT":
			    case "TCC":
			    case "TCA":
			    case "TCG":
			    case "AGT":
			    case "AGC":
			    	f3builder.append("S");
			    break;
			    
			    case "ACT":
			    case "ACC":
			    case "ACA":
			    case "ACG":
			    	f3builder.append("T");
			    break;
			    
			    case "TGG":
			    	f3builder.append("W");
			    break;
			    
			    case "TAT":
			    case "TAC":
			    	f3builder.append("Y");
			    break;

			    case "GTT":
			    case "GTC":
			    case "GTA":
			    case "GTG":
			    	f3builder.append("V");
			    break;
			    
			    case "TGA":
			    case "TAA":
			    case "TAG":
			    	f3builder.append("SC!");  //Possible stop codon detected!!!!!!!!!
			    break;
			    
			    default:
			    	break ascannermurky;
			    }
			    System.out.print(f3builder + "   ");
			}
			System.out.print(" (Amino Acid Consensus Sequence:  Origin RNA Sequence Frame 3)\n");
			
        }
        	importSeq.close();
    }
        	
}

/*SOURCE: 
 * www.tutorialspoint.com/java/java_arrays.htm
 * http://java67.blogspot.com/2012/11/how-to-read-file-in-java-using-scanner-example.html#ixzz3oxtRN3VS
 * http://java67.blogspot.com/2012/11/how-to-read-file-in-java-using-scanner-example.html
 * http://javadevnotes.com/java-split-string-into-arraylist-examples
 * stackoverflow.com/questions/6681704/how-to-remove-elements-from-an-array-in-java-even-if-we-have-to-iterate-over-arr
 * http://stackoverflow.com/questions/23522446/efficient-way-of-converting-rna-sequence-to-protein-in-java-and-arrayoutofbound
 */

