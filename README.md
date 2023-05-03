# Music Visualiser Project

Name: Sean Culleton
Student Number: C21397083

Name: David McCormack
Student Number: C21755305

Name: Jack O' kelly
Student Number: C21461876

Name: John Hinch
Student Number: C21718369

# Description of the assignment
Our groups Music Visualizer compiles a montage of different visuals all inspired by the song "Eyelar" by Fred Again. The song was split into parts which transition using an in-built timer. These parts/animation showcase our creative and technical skills for object oriented programming in Java, as part of this music visualier project.

# Instructions
press fn + f5 and watch the code on VSC, also press spacebar and it begins.
or watch it here on Youtube: https://youtu.be/dfZdfHreKV8


## Screenshots


# How it works
### Timer
A timing system used throughout the program that dictates which visuals play at which time. Depending on the time set.

### Stars
We used a background(0) to create a black background and created a star class, this star class was then used to create stars in a for loop using a speed set by smoothedAmplitude.

### Eyelar intro
We used text that came letter by letter for eyelar using if and if else statements

### Solar system
We used ellipses that rotate using a theta variable and translate() to create planets that rotate around one big planet

### Horizon Vertex
We used vertexes to create an animation of a blue horizon as if you are speeding through the horizon. The vertexes took parameters that changed in a for loop to create the animation.

### Eye
The eye is quite similiar to the vertex, we took in different parameters for the eye that changed the animation in a for loop. Also, there were 3 stars moving in random directions that only became visible when infront of the blue in the eye.

### Eyelar Outro
It is similiar also to the horizon vertex, the circles were removed and it gradually faded to the starry night alone again then into a black screen to finish the visuals off. The horizon was also made thinner.

# What we are most proud of in the assignment
- Working together as a team to overcome obstacles and to gain a sense of what it will feel like to work in coding teams in an internship next year (hopefully).
- How creative we became with coming up with and implementing the different visual animations with the music.
- How well the animations worked together all being linked by a starry night and a blue pallet of colours.
- Gaining a greater understanding of java processing systems.

## Screenshots
![A different image](https://oopassignment.files.wordpress.com/2023/05/eyelar-1.jpeg?w=1024)

# List of classes/assets

| Class/asset | Source |
|-----------|-----------|
| MyClass.cs | Self written |
| MyClass1.cs | Modified from [reference]() |
| MyClass2.cs | From [reference]() |

Each team member or individual needs to write a paragraph or two explaining what they contributed to the project

- What they did
- What they are most proud of
- What they learned

# References
* Item 1
* Item 2

# From here on, are examples of how to different things in Markdown. You can delete.  

## This is how to markdown text:

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |


