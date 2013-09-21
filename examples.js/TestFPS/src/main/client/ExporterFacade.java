package main.client;

import org.timepedia.exporter.client.Export;
import org.timepedia.exporter.client.ExportConstructor;
import org.timepedia.exporter.client.ExportOverlay;
import org.timepedia.exporter.client.ExportPackage;

import processing.core.PApplet;

import com.google.gwt.core.client.JavaScriptObject;

public class ExporterFacade {
	
	
	@ExportPackage("")	
	@Export ("Animation2D")

	public static abstract class Animation2DFacade implements ExportOverlay<Animation2D> {

		@ExportConstructor
		public static Animation2D constructor(JavaScriptObject ctx)
		{
			return new 	Animation2D( new PApplet (ctx));			
		}
		
		public abstract void setup();
		public abstract void draw();
		public abstract void keyPressed();

		

	}
	
	@ExportPackage("")	
	@Export ("Animation3D")

	public static abstract class Animation3DFacade implements ExportOverlay<Animation3D> {

		@ExportConstructor
		public static Animation3D constructor(JavaScriptObject ctx)
		{
			return new 	Animation3D( new PApplet (ctx));			
		}
		
		public abstract void setup();
		public abstract void draw();
		public abstract void keyPressed();

		

	}		

}
