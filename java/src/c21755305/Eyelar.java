package c21755305;

import java.util.ArrayList;
import ddf.minim.*;
import ie.tudublin.*;
import processing. core.PApplet; 
import processing.core.PVector;



public class Eyelar extends PApplet {

    Audio1 a1;
    Minim minim;
    AudioPlayer ap;
    AudioInput ai;
    AudioBuffer ab;
    public Timer timer; 

    int mode = 0;
    float seconds = 0;
    float theta = 0;

    float y = 0;
    float smoothedY = 0;
    float smoothedAmplitude = 0;
    ArrayList<Star> stars = new ArrayList<Star>();
    float speed;

    PVector[][] globe;
    int r = 200;
    int total = 25;
    float angleX = 0;
    float angleY = 0;


    public Eyelar(Audio1 a1)
    {
        this.a1 = a1;
    }

    public void rendar()
    {
        // timer.update();
		float halfH = height / 2;
		float halfW = width / 2;
		float average = 0;
		float sum = 0;
		
		// Calculate sum and average of the samples
		// Also lerp each element of buffer;
		for (int i = 0; i < ab.size(); i++) {
			sum += abs(ab.get(i));
		}
		average = sum / (float) ab.size();

		smoothedAmplitude = lerp(smoothedAmplitude, average, 0.2f);

		float cx = width / 2;
		float cy = height / 2;

		seconds = millis() / 1000.0f;
		System.out.println(seconds);
		if (seconds >= 2 && seconds < 6) {

			speed = map(mouseX, 0, width, 0, 50);
			a1.background(0);
			
			for (int i = 0; i < stars.size(); i++) {
			stars.get(i).update();
			stars.get(i).show();
			}

			
			a1.strokeWeight(1);

			a1.rectMode(PApplet.CENTER);

			a1.fill(0, 150, 255);
			a1.textSize(200);
			a1.text("E", width / 2 - 350, height / 2 + 80);
			
			a1.fill(63, 0, 255);
			a1.textSize(200);
			a1.text("E", width / 2 - 340, height / 2 + 80);
			

		}

		else if (seconds >= 6 && seconds < 9) {

			speed = map(mouseX, 0, width, 0, 50);
			a1.background(0);
			
			for (int i = 0; i < stars.size(); i++) {
			stars.get(i).update();
			stars.get(i).show();
			}

			a1.strokeWeight(1);
			

			a1.rectMode(PApplet.CENTER);

			a1.fill(0, 150, 255);
			a1.textSize(200);
			a1.text("EY", width / 2 - 350, height / 2 + 80);

			a1.fill(63, 0, 255);
			a1.textSize(200);
			a1.text("EY", width / 2 - 340, height / 2 + 80);

		}

		else if (seconds >= 9 && seconds < 12) {

			speed = map(mouseX, 0, width, 0, 50);
			a1.background(0);
			
			for (int i = 0; i < stars.size(); i++) {
			stars.get(i).update();
			stars.get(i).show();
			}
			
			a1.strokeWeight(1);
			

			a1.rectMode(PApplet.CENTER);

			a1.fill(0, 150, 255);
			a1.textSize(200);
			a1.text("EYE", width / 2 - 350, height / 2 + 80);

			a1.fill(63, 0, 255);
			a1.textSize(200);
			a1.text("EYE", width / 2 - 340, height / 2 + 80);

		}

		else if (seconds >= 12 && seconds < 15) {

			speed = map(mouseX, 0, width, 0, 50);
			a1.background(0);
			
			for (int i = 0; i < stars.size(); i++) {
			stars.get(i).update();
			stars.get(i).show();
			}
			
			a1.strokeWeight(1);
			

			a1.rectMode(PApplet.CENTER);

		    a1.fill(0, 150, 255);
			a1.textSize(200);
			a1.text("EYEL", width / 2 - 350, height / 2 + 80);

			a1.fill(63, 0, 255);
			a1.textSize(200);
			a1.text("EYEL", width / 2 - 340, height / 2 + 80);

		}

		else if (seconds >= 15 && seconds < 18) {

			speed = map(mouseX, 0, width, 0, 50);
			a1.background(0);
			
			for (int i = 0; i < stars.size(); i++) {
			stars.get(i).update();
			stars.get(i).show();
			}
			
			a1.strokeWeight(1);
			

			a1.rectMode(PApplet.CENTER);
		    a1.fill(0, 150, 255);
			a1.textSize(200);
			a1.text("EYELA", width / 2 - 350, height / 2 + 80);

			a1.fill(63, 0, 255);
			a1.textSize(200);
			a1.text("EYELA", width / 2 - 340, height / 2 + 80);

		}

		else if (seconds >= 18 && seconds < 20) {

			speed = map(mouseX, 0, width, 0, 50);
			a1.background(0);
			for (int i = 0; i < stars.size(); i++) {
			stars.get(i).update();
			stars.get(i).show();
			}
			
			a1.strokeWeight(1);
			

			a1.rectMode(PApplet.CENTER);

		    a1.fill(0, 150, 255);
			a1.textSize(200);
			a1.text("EYELAR", width / 2 - 350, height / 2 + 80);

			a1.fill(63, 0, 255);
			a1.textSize(200);
			a1.text("EYELAR", width / 2 - 340, height / 2 + 80);

		} else if (seconds >= 20 && seconds < 25) {

			speed = map(mouseX, 0, width, 0, 50);
			a1.background(0);
			
			for (int i = 0; i < stars.size(); i++) {
			stars.get(i).update();
			stars.get(i).show();
			}
			
			a1.strokeWeight(1);
			

			a1.rectMode(PApplet.CENTER);
	        a1.fill(0, 150, 255);
			a1.textSize(200);
			a1.text("WELCOME", width / 2 - 500, height / 2 + 80);

			a1.fill(63, 0, 255);
			a1.textSize(200);
			a1.text("WELCOME", width / 2 - 490, height / 2 + 80);

      
     		 a1.endShape();
    
			
			
		}

    }

    class Star {
        float x;
        float y;
        float z;
        float pz;

        Star() {
            x = random(-a1.width / 2, a1.width / 2);
            y = random(-a1.height / 2, a1.height / 2);
            z = random(a1.width / 2);
            pz = z;
        }

        void update() {
            z = z - speed;
            if (z < 1) {
                z = a1.width / 2;
                x = random(-a1.width / 2, a1.width / 2);
                y = random(-a1.height / 2, a1.height / 2);
                pz = z;
            }
        }

        void show() {
            fill(255);
            noStroke();

            float sx = map(x / z, 0, 1, 0, a1.width);
            float sy = map(y / z, 0, 1, 0, a1.height);

            float r = map(z, 0, a1.width / 2, 8, 0);
            ellipse(sx, sy, r, r);

            float px = map(x / pz, 0, 1, 0, a1.width);
            float py = map(y / pz, 0, 1, 0, a1.height);

            stroke(255);
            line(px, py, sx, sy);

            pz = z;
        }
    }

    
}

