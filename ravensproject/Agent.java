package ravensproject;

import java.util.ArrayList;
import java.util.HashMap;

import java.awt.FlowLayout;
// Uncomment these lines to access image processing.
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Your Agent for solving Raven's Progressive Matrices. You MUST modify this
 * file.
 * 
 * You may also create and submit new files in addition to modifying this file.
 * 
 * Make sure your file retains methods with the signatures:
 * public Agent()
 * public char Solve(RavensProblem problem)
 * 
 * These methods will be necessary for the project's main method to run.
 * 
 */
public class Agent {
	/**
	 * The default constructor for your Agent. Make sure to execute any
	 * processing necessary before your Agent starts solving problems here.
	 * 
	 * Do not add any variables to this signature; they will not be used by
	 * main().
	 * 
	 */


	boolean[][] a = null;
	boolean[][] b = null;
	boolean[][] c = null;
	boolean[][] d = null;
	boolean[][] e = null;
	boolean[][] f = null;
	boolean[][] g = null;
	boolean[][] h = null;
	boolean[][] option1 = null;
	boolean[][] option2 = null;
	boolean[][] option3 = null;
	boolean[][] option4 = null;
	boolean[][] option5 = null;
	boolean[][] option6 = null;
	boolean[][] option7 = null;
	boolean[][] option8 = null;
	ArrayList<boolean[][]> options  = null;


	public Agent() {
		options = new ArrayList<boolean[][]>();
		//    	System.out.println("SIZE IS "+options.size());
	}
	/**
	 * The primary method for solving incoming Raven's Progressive Matrices.
	 * For each problem, your Agent's Solve() method will be called. At the
	 * conclusion of Solve(), your Agent should return a String representing its
	 * answer to the question: "1", "2", "3", "4", "5", or "6". These Strings
	 * are also the Names of the individual RavensFigures, obtained through
	 * RavensFigure.getName().
	 * 
	 * In addition to returning your answer at the end of the method, your Agent
	 * may also call problem.checkAnswer(String givenAnswer). The parameter
	 * passed to checkAnswer should be your Agent's current guess for the
	 * problem; checkAnswer will return the correct answer to the problem. This
	 * allows your Agent to check its answer. Note, however, that after your
	 * agent has called checkAnswer, it will *not* be able to change its answer.
	 * checkAnswer is used to allow your Agent to learn from its incorrect
	 * answers; however, your Agent cannot change the answer to a question it
	 * has already answered.
	 * 
	 * If your Agent calls checkAnswer during execution of Solve, the answer it
	 * returns will be ignored; otherwise, the answer returned at the end of
	 * Solve will be taken as your Agent's answer to this problem.
	 * 
	 * @param problem the RavensProblem your agent should solve
	 * @return your Agent's answer to this problem
	 */
	public int Solve(RavensProblem problem) {


		if (problem.hasVerbal() || !problem.getProblemType().equals("3x3")){
			return -1;
		}
		System.out.println(problem.getName());
		HashMap<String, RavensFigure> figs = problem.getFigures();

		RavensFigure figA = figs.get("A");
		RavensFigure figB = figs.get("B");
		RavensFigure figC = figs.get("C");
		RavensFigure figD = figs.get("D");
		RavensFigure figE = figs.get("E");
		RavensFigure figF = figs.get("F");
		RavensFigure figG = figs.get("G");
		RavensFigure figH = figs.get("H");
		RavensFigure fig1 = figs.get("1");
		RavensFigure fig2 = figs.get("2");
		RavensFigure fig3 = figs.get("3");
		RavensFigure fig4 = figs.get("4");
		RavensFigure fig5 = figs.get("5");
		RavensFigure fig6 = figs.get("6");
		RavensFigure fig7 = figs.get("7");
		RavensFigure fig8 = figs.get("8");
		BufferedImage pictureA = null;
		BufferedImage pictureB = null;
		BufferedImage pictureC= null;
		BufferedImage pictureD= null;
		BufferedImage pictureE= null;
		BufferedImage pictureF= null;
		BufferedImage pictureG= null;
		BufferedImage pictureH= null;
		BufferedImage picture1= null;
		BufferedImage picture2= null;
		BufferedImage picture3= null;
		BufferedImage picture4= null;
		BufferedImage picture5= null;
		BufferedImage picture6= null;
		BufferedImage picture7= null;
		BufferedImage picture8= null;




		try {
			pictureA = ImageIO.read(new File(figA.getVisual()));
			pictureB = ImageIO.read(new File(figB.getVisual()));
			pictureC = ImageIO.read(new File(figC.getVisual()));
			pictureD = ImageIO.read(new File(figD.getVisual()));
			pictureE = ImageIO.read(new File(figE.getVisual()));
			pictureF = ImageIO.read(new File(figF.getVisual()));
			pictureG = ImageIO.read(new File(figG.getVisual()));
			pictureH = ImageIO.read(new File(figH.getVisual()));
			picture1 = ImageIO.read(new File(fig1.getVisual()));
			picture2 = ImageIO.read(new File(fig2.getVisual()));
			picture3 = ImageIO.read(new File(fig3.getVisual()));
			picture4 = ImageIO.read(new File(fig4.getVisual()));
			picture5 = ImageIO.read(new File(fig5.getVisual()));
			picture6 = ImageIO.read(new File(fig6.getVisual()));
			picture7 = ImageIO.read(new File(fig7.getVisual()));
			picture8 = ImageIO.read(new File(fig8.getVisual()));

			a = getBooleanArray(pictureA);
			b = getBooleanArray(pictureB);
			c = getBooleanArray(pictureC);
			d = getBooleanArray(pictureD);
			e = getBooleanArray(pictureE);
			f = getBooleanArray(pictureF);
			g = getBooleanArray(pictureG);
			h = getBooleanArray(pictureH);
			option1 = getBooleanArray(picture1);
			option2 = getBooleanArray(picture2);
			option3 = getBooleanArray(picture3);
			option4 = getBooleanArray(picture4);
			option5 = getBooleanArray(picture5);
			option6 = getBooleanArray(picture6);
			option7 = getBooleanArray(picture7);
			option8 = getBooleanArray(picture8);

			options.add(option1);
			options.add(option2);
			options.add(option3);
			options.add(option4);
			options.add(option5);
			options.add(option6);
			options.add(option7);
			options.add(option8);

		} catch (IOException e1) {
			e1.printStackTrace();
		}

		//        boolean[][] idealResult = solveProblem(a,b,c,d,e,f,g,h, option1,option2, option3, option4, option5, option6, option7, option8);
		//drawBoolean(idealResult);
		int optionToChose = solveProblem(a,b,c,d,e,f,g,h);

		//		int optionToChose = -1;
		//		double maxScore = Double.MIN_VALUE;
		//
		//        for(int i=0;i<options.size();i++){
		//        	double OptionScore = checkEquality(idealResult, options.get(i));
		//        	//System.out.println(OptionScore);
		//        	if (maxScore<OptionScore){
		//        		maxScore = OptionScore;
		//        		optionToChose = i+1;
		//        	}
		//        }
		System.out.println("Your Answer: " + (optionToChose) + ", CorrectAnswer: "+	problem.checkAnswer(optionToChose));
		options.clear();
		return (optionToChose);
	}


	private int solveProblem(boolean[][] a, boolean[][] b, boolean[][] c,
			boolean[][] d, boolean[][] e, boolean[][] f, boolean[][] g,
			boolean[][] h) {

		//checking if it's an XOR of A and B
		ArrayList<Double> scores = new ArrayList<Double>();
		boolean[][] aXorB = getXor(a, b);
		double xorScore = checkEquality(aXorB, c);
		scores.add(xorScore);

		// check if it's a union of A and B    	
		boolean[][] aOrB = getOr(a, b);
		double orScore = checkEquality(aOrB, c);
		//drawBoolean(aOrB);
		//drawBoolean(c);
		scores.add(orScore);


		//checking if it's an AND of A and B
		boolean[][] aAndB = getAnd(a, b);
		double andScore = checkEquality(aAndB, c);
		scores.add(andScore);	

		//check if it's a pattern shift. 
		int endShift = -1;
		double maxEqual  = Double.NEGATIVE_INFINITY;
		int shift = 0;
		double aequalsd = checkEquality(a, c);
		double bequalse =checkEquality(b, e);
		double cequalsf = checkEquality(c, f);
		endShift = shift;
		maxEqual = (aequalsd+bequalse+cequalsf)/3;
		shift = 1;
		double aequalse = checkEquality(a, e);
		double bequalsf =checkEquality(b, f);
		double cequalsd = checkEquality(c, d);
		if ((aequalse+bequalsf+cequalsd)/3>maxEqual){
			maxEqual = (aequalse+bequalsf+cequalsd)/3;
			endShift = shift;
		}
		shift = 2;
		double aequalsf = checkEquality(a, f);
		double bequalsd =checkEquality(b, d);
		double cequalse = checkEquality(c, e);
		if ((aequalsf+bequalsd+cequalse)/3>maxEqual){
			maxEqual = (aequalsf+bequalsd+cequalse)/3;
			endShift = shift;
		}
		scores.add(maxEqual);
//		System.out.println("The shift was: "+endShift);


		//check if each row has a one of each pattern.
		boolean[][] bXorC = getXor(b, c);
		boolean[][] endPattern = getOr(aXorB, bXorC);
		//drawBoolean(endPattern);
		boolean[][] dXorE = getXor(d,e);
		boolean[][] eXorF = getXor(e, f);
		boolean[][] otherPattern = getOr(dXorE, eXorF);
		double oneEachPatternScore = checkEquality(endPattern, otherPattern);
		//drawBoolean(otherPattern);
		scores.add(oneEachPatternScore);

		//TRY Pixel count
		int countInA = countPixels(a);
		int countInB = countPixels(b);
		double countInC = countPixels(c);
		

		int diff = Math.abs(countInB- countInA);
//		System.out.println(diff);
//		System.out.println(countInC);
		double pixelSubtractionScore = (countInC - Math.abs(diff-countInC))/countInC;
		int sum  = Math.abs(countInB+ countInA);
		System.out.println(sum);
		double pixelAddScore = (countInC - Math.abs(sum-countInC))/countInC;
		scores.add(pixelSubtractionScore*100);
		scores.add(pixelAddScore*100);


		System.out.println(scores);
		double max = Double.MIN_VALUE;
		ArrayList<Integer> possibleOperations = new ArrayList<Integer>();
		for (int i=0;i<scores.size();i++){
			
			if(i==5||i==6){
				if(!(Math.abs(scores.get(i)-max)>7.5)){
					continue;
				}
			}
			else{
			
			if (scores.get(i)>max && max<93){
				max = scores.get(i);
				possibleOperations.clear();
				possibleOperations.add(i);
			}
			}

		}
		//    	System.out.println(possibleOperations);
		if (possibleOperations.size()==1){

			return performOperation(possibleOperations.get(0),g, h, endPattern, endShift);
		}
		//also check vertical since two or more operations resulted in the same output for c.
		int index = 0;
		boolean[][] aXorD = getXor(a, d);
		double xorScoreAD = checkEquality(aXorD, g);
		scores.set(index,xorScoreAD);

		index++;

		boolean[][] aOrD = getOr(a, d);
		double orScoreAD = checkEquality(aOrD, g);
		scores.set(index,orScoreAD);

		index++;

		boolean[][] aAndD = getAnd(a, d);
		double andScoreAD = checkEquality(aAndD, g);
		scores.set(index,andScoreAD);

		possibleOperations.clear();
		max = Double.MIN_VALUE;
		for (int i=0;i<scores.size();i++){
			if (scores.get(i)>max){
				max = scores.get(i);
				possibleOperations.clear();
				possibleOperations.add(i);
			}
			if (scores.get(i)==max){
				possibleOperations.add(i);
			}
		}
		System.out.println(scores);
		//    	drawBoolean(getXor(g, h));
		//    	System.out.println(pos);
		return performOperation(possibleOperations.get(0), c, f , null , -1);
	}

	private int countPixels(boolean[][] c2) {
		int count=0;
		for (int i=0 ; i<c2.length;i++){
			for(int j=0; j<c2[0].length;j++){
				if(c2[i][j]){
					count++;
				}
			}
		}
		return count;
	}
	private int performOperation(int x , boolean[][] g_c, boolean[][] h_f, boolean[][] endPattern, int endShift){
		//System.out.println("OPERATION "+x);
		switch (x){
		case 0: 
			return testGenerated(getXor(g_c,h_f));

		case 1: return testGenerated(getOr(g_c, h_f));
		case 2: return testGenerated(getAnd(g_c, h_f));
		case 3: 
			return pickOptionAndTestForShift(endShift);

		case 4: 
			return pickOptionAndTest(g_c, h_f, endPattern); 
		case 5: return pickOptionAndCheckPixels(g_c ,h_f,  true);
		case 6: return pickOptionAndCheckPixels(g_c , h_f , false);

		default: return -1 ;
		}

	}


	private int pickOptionAndCheckPixels(boolean[][] g ,boolean[][] h, boolean i) {
		
		int countInG = countPixels(g);
		int countInH = countPixels(h);
		int diff = Math.abs(countInG- countInH);
		int sum  = Math.abs(countInG+ countInH);

		double bestScore = Double.MAX_VALUE;
		int optionToChose = -1;
		double prevEquality = -1;
		for(int k=0;k<options.size();k++){
		double countInI = countPixels(options.get(k));
		double pixelScore;
		if(i){
			 pixelScore = (Math.abs(diff-countInI))/countInI;
		}
		else{
			pixelScore = (Math.abs(sum-countInI))/countInI;
		}
		if(pixelScore<bestScore ){
			bestScore  = pixelScore;
			optionToChose = k+1;
			prevEquality = checkEquality(g, options.get(k));
		}
		else if(pixelScore == bestScore){
			double newEquals = checkEquality(g, options.get(k));
			if (Math.abs(prevEquality-newEquals)<2){
				
				optionToChose = k+1;
				prevEquality = newEquals;
				
			}
		}
		}
		return optionToChose;
		
	}
	private int pickOptionAndTestForShift(int endShift) {
		System.out.println("DOING SHIFT");
		if (endShift==0){
			return testGenerated(f);
		}
		else if(endShift==1){
			return testGenerated(e);
		}
		else {
			return testGenerated(d);
		}
	}
	private int pickOptionAndTest(boolean[][] g_c, boolean[][] h_f, boolean[][] endPattern) {

		int optionToChose = -1;
		double maxScore = Double.MIN_VALUE;

		for(int i=0;i<options.size();i++){
			boolean[][] g_cXorH_f = getXor(g_c, h_f);
			boolean[][] h_fXorOption = getXor(h_f,options.get(i));
			boolean[][] optionPattern = getOr(g_cXorH_f,h_fXorOption);
			//drawBoolean(optionPattern);
			double optionScore = checkEquality(endPattern, optionPattern);
			//			System.out.println(optionScore);
			if (maxScore<optionScore){
				maxScore = optionScore;
				optionToChose = i+1;
			}
		}
		return optionToChose;
	}
	private int testGenerated(boolean[][] idealResult) {
		int optionToChose = -1;
		double maxScore = Double.MIN_VALUE;

		for(int i=0;i<options.size();i++){
			double optionScore = checkEquality(idealResult, options.get(i));
			//System.out.println(OptionScore);
			if (maxScore<optionScore){
				maxScore = optionScore;
				optionToChose = i+1;
			}
		}
		//        System.out.println("Output option "+optionToChose);
		return optionToChose;
	}
	private void drawBoolean(boolean[][] a){
		BufferedImage imageToDraw = new BufferedImage(a.length,a[0].length, BufferedImage.TYPE_INT_RGB);
		for (int i=0;i<a.length ; i++){
			for (int j=0;j<a[0].length;j++){
				if (a[i][j]){
					imageToDraw.setRGB(i,j,0);
				}
				else{
					imageToDraw.setRGB(i,j,0xFFFFFFFF);
				}
			}
		}
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(new JLabel(new ImageIcon(imageToDraw)));
		frame.pack();
		frame.setVisible(true);

	}


	private boolean[][] getOr(boolean[][] a, boolean[][] b){
		boolean[][] out = new boolean[a.length][a[0].length];
		for(int i=0;i<a.length;i++){
			for(int j=0; j<a[0].length;j++){
				out[i][j] = a[i][j]||b[i][j];
			}
		}

		out  = correctImage(out);

		return out;
	}

	private boolean[][] getAnd(boolean[][] a, boolean[][] b){
		boolean[][] out = new boolean[a.length][a[0].length];
		for(int i=0;i<a.length;i++){
			for(int j=0; j<a[0].length;j++){
				out[i][j] = a[i][j]&&b[i][j];
			}
		}

		out  = correctImage(out);

		return out;
	}

	private boolean[][] getXor(boolean[][] a, boolean[][] b){
		boolean[][] out = new boolean[a.length][a[0].length];
		for(int i=0;i<a.length;i++){
			for(int j=0; j<a[0].length;j++){
				out[i][j] = a[i][j]^b[i][j];
			}
		}

		out  = correctImage(out);
		return out;
	}

	//    private double checkEquality(boolean[][] a, boolean[][] b){
	//    	
	//    	double correct = 0.0;
	//    	int count = 0;
	//    	for(int i=0; i<a.length;i++){
	//    		for(int j=0; j<a[0].length ; j++){
	//    			if(a[i][j]==b[i][j]){
	//    				correct++;
	//    			}
	//    			count++;
	//    		}
	//    	}
	//    	return (correct/count)*100;
	//    }

	private boolean[][] correctImage(boolean[][] out) {
		for(int i=0 ; i<out.length; i++){
			for(int j=0; j<out[0].length; j++){
				if(out[i][j]){
					if((!out[i][j-1]&& !out[i][j+1]) || (!out[i-1][j] && !out[i+1][j])){
						out[i][j] = false;
					}
				}
			}
		}
		return out;
	}
	private double checkEquality(boolean[][] a, boolean[][] b){
		double mismatchCount=0;
		double totalBlack=0;

		for(int i=0; i<a.length;i++){
			for(int j=0; j<a[0].length ; j++){
				if(a[i][j] && !b[i][j]){
					mismatchCount++;
				}
				else if (b[i][j] && !a[i][j]){
					mismatchCount++;
				}
				if (a[i][j]||b[i][j]){
					totalBlack++;

				}
			}
		}

		double correct = ((totalBlack-mismatchCount)/totalBlack)*100;
		return correct;
	}

	private boolean[][] getBooleanArray(BufferedImage a){

		boolean[][] out = new boolean[a.getWidth()][a.getHeight()];
		for (int i=0;i<a.getWidth() ;i++){
			for (int j=0 ; j<a.getHeight();j++){
				int pixelColor = a.getRGB(i, j);
				int red                 = (pixelColor & 0x00ff0000) >> 16;
			int green               = (pixelColor & 0x0000ff00) >> 8;
			int blue                =  pixelColor & 0x000000ff;
			if((red <123 && green <123 && blue<123)){
				out[i][j]=true;
			}
			else{
				out[i][j] = false;
			}
			}
		}
		return out;
	}








}
