package Probability;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ProbabilityUI {
    JFrame myFrame = new JFrame("PROBABILITY");
    JLabel SignUpLabel = new JLabel("Sign_UP");
    JTextField SignInEmail = new JTextField("Sign_in with Email");
    JTextField Password = new JTextField("Password");

    JFrame SignInFrame = new JFrame("Choose a Probability Type");
    JButton SignInButton = new JButton("Login");

    JFrame BernoulliFrame = new JFrame("Bernoulli Probability");
    JButton Ber_Distribution = new JButton("Distribution");
    JButton Ber_Mean = new JButton("Mean X");
    JButton Ber_Variance = new JButton("Variance");
    JButton Ber_SD = new JButton("Deviation...");
    JButton Ber_CV = new JButton("Coefficient...");


    JFrame Ber_DistributionFrame = new JFrame(" Bernoulli Distribution");
    JButton BernoulliButton = new JButton("Bernoulli Probability");
    JTextField Ber_Probability = new JTextField("Probability");
    JTextField Ber_Trial = new JTextField(" Trial x");
    JButton CalculateBer_Dis = new JButton("Bernoulli = ");

    JFrame Ber_MeanFrame = new JFrame("Bernoulli Mean");
    JTextField BerMean_Probability = new JTextField("Probability");
    JButton CalculateBer_Mean = new JButton("Mean X = ");

    JFrame Ber_VarianceFrame = new JFrame("Bernoulli Variance");
    JTextField BerVar_Probability = new JTextField("Probability");
    JButton CalculateBer_Variance = new JButton("Variance");

    JFrame Ber_SDFrame = new JFrame("Bernoulli Standard Deviation");
    JTextField BerSD_Variance = new JTextField("Variance");
    JButton CalculateBer_SD = new JButton("S_D = ");

    JFrame Ber_CVFrame = new JFrame("Coefficient of Variation");
    JTextField BerCV_SD = new JTextField("...Variation");
    JTextField BerCV_Mean = new JTextField("Mean X ");
    JButton CalculateBer_CV = new JButton("C_V = ");

    JFrame GeometryFrame = new JFrame("Geometry Probability");
    JButton GeometryButton = new JButton("Geometry Probability");
    JButton Geo_Distribution = new JButton("Distribution");
    JButton Geo_Mean = new JButton("Mean X");
    JButton Geo_Variance = new JButton("Variance");
    JButton Geo_SD = new JButton("Deviation");
    JButton Geo_CV = new JButton("Coefficient...");

    JFrame Geo_DistributionFrame = new JFrame(" Geometry Distribution");
    JTextField Geo_Probability = new JTextField("Probaility");
    JTextField Geo_Trial = new JTextField(" Trial x");
    JButton CalculateGeo_Dis = new JButton("Geometry = ");

    JFrame Geo_MeanFrame = new JFrame("Geometry Mean");
    JTextField GeoMean_Probability = new JTextField("Probability");
    JButton CalculateGeo_Mean = new JButton("Mean X = ");

    JFrame Geo_VarianceFrame = new JFrame("Geometry Variance");
    JTextField GeoVar_Probability = new JTextField("Probability");
    JButton CalculateGeo_Variance = new JButton("Variance = ");

    JFrame Geo_SDFrame = new JFrame("Geometry Standard Deviation");
    JTextField GeoSD_Variance = new JTextField("Variance");
    JButton CalculateGeo_SD = new JButton("S_D = ");


    JFrame Geo_CVFrame = new JFrame("Coefficient of Variation");
    JTextField GeoCV_SD = new JTextField("...Variation");
    JTextField GeoCV_Mean = new JTextField("Mean X");
    JButton CalculateGeo_CV = new JButton("C_V");

    public void StatisticsUI() {
        myFrame.add(SignUpLabel);
        myFrame.add(SignInEmail);
        myFrame.add(Password);
        myFrame.add(SignInButton);
        myFrame.setSize(800, 400);
        myFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        SignInButton.addActionListener(e -> {
            System.out.println("Probability");

            String Email = SignInEmail.getText();
            String password = Password.getText();
            if (Email.contains("@") && Email.contains(".")) {
                // Password validation
                if (password.length() >= 8) {
                    System.out.println("Email and password accepted!");
                    drawSignInFrame();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid password. Password must be at least 8 characters long. or");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid email address.");
            }
        });
    }

    private void drawSignInFrame() {
        SignInFrame = new JFrame("Choose a Probability Type");
        SignInFrame.add(BernoulliButton);
        SignInFrame.add(GeometryButton);
        SignInFrame.setSize(800, 400);
        SignInFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        SignInFrame.setVisible(true);

        BernoulliButton.addActionListener(e -> {
            drawBernoulliFrame();
        });
        GeometryButton.addActionListener(e -> {
            drawGeometryFrame();
        });
    }

    public void drawBernoulliFrame() {
        BernoulliFrame = new JFrame("BERNOULLI PROBABILITY DISTRIBUTION");
        BernoulliFrame.add(Ber_Distribution);
        BernoulliFrame.add(Ber_Mean);
        BernoulliFrame.add(Ber_Variance);
        BernoulliFrame.add(Ber_SD);
        BernoulliFrame.add(Ber_CV);
        BernoulliFrame.setSize(800, 500);
        BernoulliFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        BernoulliFrame.setVisible(true);

        Ber_Distribution.addActionListener(e -> {
            drawBer_DistributionFrame();
        });
        Ber_Mean.addActionListener(e -> {
            drawBer_MeanFrame();
        });
        Ber_Variance.addActionListener(e -> {
            drawBer_VarianceFrame();
        });
        Ber_SD.addActionListener(e -> {
            drawBer_SDFrame();
        });
        Ber_CV.addActionListener(e -> {
            drawBer_CVFrame();
        });
    }

    public void drawBer_DistributionFrame() {
        Ber_DistributionFrame = new JFrame("Bernoulli Distribution");
        Ber_DistributionFrame.add(Ber_Probability);
        Ber_DistributionFrame.add(Ber_Trial);
        Ber_DistributionFrame.add(CalculateBer_Dis);
        Ber_DistributionFrame.setSize(400, 400);
        Ber_DistributionFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
        Ber_DistributionFrame.setVisible(true);

        CalculateBer_Dis.addActionListener(e -> {

            try {
                float Probability = Float.parseFloat(Ber_Probability.getText());
                float Trial = Float.parseFloat(Ber_Trial.getText());
                float Bernoulli = (float) (pow(Probability, Trial) * pow((1 - Probability), (1 - Trial)));
                JOptionPane.showMessageDialog(null, "Bernoulli = " + Bernoulli);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Input a Number");
            }
        });
    }
    public void drawBer_MeanFrame(){
        Ber_MeanFrame = new JFrame("Bernoulli Mean");
        Ber_MeanFrame.add(BerMean_Probability);
        Ber_MeanFrame.add(CalculateBer_Mean);
        Ber_MeanFrame.setSize(400,400);
        Ber_MeanFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
        Ber_MeanFrame.setVisible(true);

        CalculateBer_Mean.addActionListener(e -> {
            try {
                float Probability = Float.parseFloat(BerMean_Probability.getText());
                float Mean = Probability;
                JOptionPane.showMessageDialog(null, "Mean X =" + Mean);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Input a Number");
            }
        });
    }

    public void drawBer_VarianceFrame(){
        Ber_VarianceFrame = new JFrame("Bernoulli Variance");
        Ber_VarianceFrame.add(BerVar_Probability);
        Ber_VarianceFrame.add(CalculateBer_Variance);
        Ber_VarianceFrame.setSize(400,400);
        Ber_VarianceFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
        Ber_VarianceFrame.setVisible(true);

        CalculateBer_Variance.addActionListener(e -> {
            try{
                float Probability = Float.parseFloat(BerVar_Probability.getText());
                float Variance = Probability * (1 - Probability);
                JOptionPane.showMessageDialog(null,"Variance = "+ Variance);
            }
            catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Input a Number");
            }
        });
    }
    public void drawBer_SDFrame() {
        Ber_SDFrame = new JFrame("Standard Deviation");
        Ber_SDFrame.add(BerSD_Variance);
        Ber_SDFrame.add(CalculateBer_SD);
        Ber_SDFrame.setSize(400, 400);
        Ber_SDFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
        Ber_SDFrame.setVisible(true);

        CalculateBer_SD.addActionListener(e -> {
            try {
                float Variance = Float.parseFloat(BerSD_Variance.getText());
                float S_D = (float) sqrt(Variance);
                JOptionPane.showMessageDialog(null, "S_D = " + S_D);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Input a Number");
            }
        });
    }
    public void drawBer_CVFrame(){
        Ber_CVFrame =  new JFrame("Coefficient Variation");
        Ber_CVFrame.add(BerCV_SD);
        Ber_CVFrame.add(BerCV_Mean);
        Ber_CVFrame.add(CalculateBer_CV);
        Ber_CVFrame.setSize(400,400);
        Ber_CVFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
        Ber_CVFrame.setVisible(true);

        CalculateBer_CV.addActionListener(e -> {
           try {
               float S_deviation = Float.parseFloat(BerCV_SD.getText());
               float Mean = Float.parseFloat(BerCV_Mean.getText());
               float CV = (S_deviation / Mean) * 100;
               JOptionPane.showMessageDialog(null,"C_V = "+ CV);
           }
           catch(NumberFormatException nfe){
               JOptionPane.showMessageDialog(null,"Input a Number");
           }
        });
    }
    public void drawGeometryFrame (){
        GeometryFrame = new JFrame("GEOMETRY PROBABILITY DISTRIBUTION");
        GeometryFrame.add(Geo_Distribution);
        GeometryFrame.add(Geo_Mean);
        GeometryFrame.add(Geo_Variance);
        GeometryFrame.add(Geo_SD);
        GeometryFrame.add(Geo_CV);
        GeometryFrame.setSize(800,500);
        GeometryFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        GeometryFrame.setVisible(true);

        Geo_Distribution.addActionListener(e -> {
            drawGeo_DistributionFrame();
        });
        Geo_Mean.addActionListener(e -> {
            drawGeo_MeanFrame();
        });
        Geo_Variance.addActionListener(e -> {
            drawGeo_VarianceFrame();
        });
        Geo_SD.addActionListener(e -> {
            drawGeo_SDFrame();
        });
        Geo_CV.addActionListener(e -> {
            drawGeo_CVFrame();
        });
    }
    public void drawGeo_DistributionFrame() {
        Geo_DistributionFrame = new JFrame("Geometry Distribution");
        Geo_DistributionFrame.add(Geo_Probability);
        Geo_DistributionFrame.add(Geo_Trial);
        Geo_DistributionFrame.add(CalculateGeo_Dis);
        Geo_DistributionFrame.setSize(400, 400);
        Geo_DistributionFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
        Geo_DistributionFrame.setVisible(true);

        CalculateGeo_Dis.addActionListener(e -> {

            try {
                float Probability = Float.parseFloat(Geo_Probability.getText());
                float Trial = Float.parseFloat(Geo_Trial.getText());
                float Geometry = (float) (Probability  * pow((1 - Probability), ( Trial - 1 )));
                JOptionPane.showMessageDialog(null, "Geometry = " + Geometry);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Input a Number");
            }
        });
    }
    public void drawGeo_MeanFrame(){
        Geo_MeanFrame = new JFrame("Geometry Mean");
        Geo_MeanFrame.add(GeoMean_Probability);
        Geo_MeanFrame.add(CalculateBer_Mean);
        Geo_MeanFrame.setSize(400,400);
        Geo_MeanFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
        Geo_MeanFrame.setVisible(true);

        CalculateGeo_Mean.addActionListener(e -> {
            try {
                float Probability = Float.parseFloat(GeoMean_Probability.getText());
                float Mean = 1 / Probability;
                JOptionPane.showMessageDialog(null, "Mean X =" + Mean);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Input a Number");
            }
        });
    }

    public void drawGeo_VarianceFrame(){
        Geo_VarianceFrame = new JFrame("Geometry Variance");
        Geo_VarianceFrame.add(GeoVar_Probability);
        Geo_VarianceFrame.add(CalculateGeo_Variance);
        Geo_VarianceFrame.setSize(400,400);
        Geo_VarianceFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
        Geo_VarianceFrame.setVisible(true);

        CalculateGeo_Variance.addActionListener(e -> {
            try{
                float Probability = Float.parseFloat(GeoVar_Probability.getText());
                float Variance = (float) ((1 - Probability) / pow(Probability,2));
                JOptionPane.showMessageDialog(null,"Variance = "+ Variance);
            }
            catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Input a Number");
            }
        });
    }
    public void drawGeo_SDFrame() {
        Geo_SDFrame = new JFrame("Standard Deviation");
        Geo_SDFrame.add(GeoSD_Variance);
        Geo_SDFrame.add(CalculateBer_SD);
        Geo_SDFrame.setSize(400, 400);
        Geo_SDFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
        Geo_SDFrame.setVisible(true);

        CalculateGeo_SD.addActionListener(e -> {
            try {
                float Variance = Float.parseFloat(GeoSD_Variance.getText());
                float S_D = (float) sqrt(Variance);
                JOptionPane.showMessageDialog(null, "S_D = " + S_D);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Input a Number");
            }
        });
    }
    public void drawGeo_CVFrame(){
        Geo_CVFrame =  new JFrame("Coefficient Variation");
        Geo_CVFrame.add(GeoCV_SD);
        Geo_CVFrame.add(GeoCV_Mean);
        Geo_CVFrame.add(CalculateBer_CV);
        Geo_CVFrame.setSize(400,400);
        Geo_CVFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
        Geo_CVFrame.setVisible(true);

        CalculateGeo_CV.addActionListener(e -> {
            try {
                float S_deviation = Float.parseFloat(GeoCV_SD.getText());
                float Mean = Float.parseFloat(GeoCV_Mean.getText());
                float CV = (S_deviation / Mean) * 100;
                JOptionPane.showMessageDialog(null,"C_V = "+ CV);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Input a Number");
            }
        });
    }
}