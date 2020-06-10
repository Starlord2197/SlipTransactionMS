{\rtf1\ansi\ansicpg1252\cocoartf2511
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fmodern\fcharset0 Courier;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;\red98\green9\blue1;\red251\green0\blue7;
\red210\green9\blue5;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;\cssrgb\c46667\c6667\c0;\cssrgb\c100000\c0\c0\c4706;
\cssrgb\c86667\c13333\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl280\partightenfactor0

\f0\fs24 \cf2 \expnd0\expndtw0\kerning0
pipeline \{\
\
		agent any\
	    	tools \{\
				maven \'91maven\'92\
		\}\
		stages \{\
        		stage(\cf3 \cb4 \'91\cf5 Compile Stage\cf3 \'92\cf2 \cb1 ) \{\
            		steps \{\
                		sh \cf3 \cb4 \'91\cf5 m\cf3 vn clean compile\'92\cf2 \cb1 \
            		\}\
			\}\
			stage (\'91Sonarqube deployment Stage\'92) \{\
				steps\{\
					sh \'91man sonar:sonar\'92\
				\}\
			\}\
		\}\
       \
\}\
}