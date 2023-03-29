package ie.tudublin;

//import example.*;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class Audio1 extends PApplet {
	Minim minim;
	AudioPlayer ap;
	AudioInput ai;
	AudioBuffer ab;
	public Timer timer;

	int mode = 0;

	
	float y = 0;
	float smoothedY = 0;
	float smoothedAmplitude = 0;

	public void keyPressed() {
		if (key >= '0' && key <= '9') {
			mode = key - '0';
		}
		if (keyCode == ' ') {
			if (ap.isPlaying()) {
				ap.pause();
			} else {
				ap.rewind();
				ap.play();
			}
		}
	}

	public void settings() {
		size(1024, 1024);
		//fullScreen(P3D, SPAN);
	}

	public void setup() {
		minim = new Minim(this);
		// Uncomment this to use the microphone
		// ai = minim.getLineIn(Minim.MONO, width, 44100, 16);
		// ab = ai.mix;

		timer = new Timer(this);
		// And comment the next two lines out
		ap = minim.loadFile("Eyelar.mp3", 1024);
		ap.play();
		ab = ap.mix;
		colorMode(RGB);

		y = height / 2;
		smoothedY = y;

	}

	float off = 0;

	void star(float x, float y, float radius1, float radius2, int npoints) {
		float angle = TWO_PI / npoints;
		float halfAngle = (float) (angle / 2.0);
		beginShape();
		for (float a = 0; a < TWO_PI; a += angle) {
			float sx = x + cos(a) * radius2;
			float sy = y + sin(a) * radius2;
			vertex(sx, sy);
			sx = x + cos(a + halfAngle) * radius1;
			sy = y + sin(a + halfAngle) * radius1;
			vertex(sx, sy);
		}
		
		endShape(CLOSE);
	}

	public void draw() {
		// background(0);
		float halfH = height / 2;
		float average = 0;
		float sum = 0;
		off += 1;
		int seconds = 0;
	
		seconds = second();
		// Calculate sum and average of the samples
		// Also lerp each element of buffer;
		for (int i = 0; i < ab.size(); i++) {
			sum += abs(ab.get(i));
		}
		average = sum / (float) ab.size();

		smoothedAmplitude = lerp(smoothedAmplitude, average, 0.2f);

		float cx = width / 2;
		float cy = height / 2;

		timer.start();
		
		System.out.println(timer.seconds());
			
				if (seconds > 2){

				
				background(0);
				strokeWeight(1);
				background(0);
		
				rectMode(PApplet.CENTER);
		
				fill(0,0,255);
				textSize(200);
				text("E",width/2 - 350,height/2 + 80);
				

				}

				if (seconds > 6){

				
					background(0);
					strokeWeight(1);
					background(0);
			
					rectMode(PApplet.CENTER);
			
					fill(5, 92, 242);
					textSize(200);
					text("EY",width/2 - 350,height/2 + 80);
					
	
					}


				if (seconds > 9){

				
				background(0);
				strokeWeight(1);
				background(0);
		
				rectMode(PApplet.CENTER);
		
				fill(12, 71, 173);
				textSize(200);
				text("EYE",width/2 - 350,height/2 + 80);
				

				}



				if (seconds > 12){

				
					background(0);
					strokeWeight(1);
					background(0);
			
					rectMode(PApplet.CENTER);
					fill(59, 127, 245);
					textSize(200);
					text("EYEL", width/2 - 350,height/2 + 80);
					
	
					}

					if (seconds > 15){

				
						background(0);
						strokeWeight(1);
						background(0);
				
						rectMode(PApplet.CENTER);
						fill(14, 52, 117);
						textSize(200);
						text("EYELA",width/2 - 350,height/2 + 80);
						
		
						}
				
						if (seconds > 18){

				
							background(0);
							strokeWeight(1);
							background(0);
					
							rectMode(PApplet.CENTER);
							fill(12, 98, 245);
							textSize(200);
							text("EYELAR",width/2 - 350,height/2 + 80);
							
			
							}
		

		
	

						}
					}
				
