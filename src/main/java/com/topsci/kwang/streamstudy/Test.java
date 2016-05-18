package com.topsci.kwang.streamstudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test {
	public static void main(String[] args) {
		PrintStream printStream = null;

		PrintStream sysout = System.out;

		PrintStream syserr = System.err;

		try {

			File file = new File("c:\\systemout.log");

			if (!file.exists()) {

				try {

					file.createNewFile();

				} catch (IOException e) {

					// TODO Auto-generated catch block

					e.printStackTrace();

				}

			}

			printStream = new PrintStream(new FileOutputStream(new File(

			"c:\\systemout.log"), true));

			// set output to file instead of console

			System.setOut(printStream);

			System.setErr(printStream);

			System.out.println("Before Redirect:System.out.println");

			System.err.println("Before Redirect:System.err.println");

		} catch (FileNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} finally {

			if (printStream != null) {

				printStream.close();

			}

			// Reset the output to console

			System.setOut(sysout);

			System.setErr(syserr);

			System.out.println("After Redirect:System.out.println");

			System.err.println("After Redirect:System.err.println");

		}

	}

}
