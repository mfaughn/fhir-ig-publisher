package org.hl7.fhir.igtools.publisher;

public class CliParams {

	public static final String DEBUG_LOG = "-debug-log";
	public static final String TRACE_LOG = "-trace-log";
	public static final String PARALLEL = "-parallel";
	public static final String PARALLEL_SPLIT = "-parallel-split";
	public static final String PARALLEL_SPLIT_WORKER = "-parallel-split-worker";

	public static String getNamedParam(String[] args, String param) {
	  boolean found = false;
	  for (String a : args) {
		if (found)
		  return a;
		if (a.equals(param)) {
		  found = true;
		}
	  }
	  return null;
	}

	public static boolean hasNamedParam(String[] args, String param) {
	  for (String a : args) {
		if (a.equals(param)) {
		  return true;
		}
	  }
	  return false;
	}
}
