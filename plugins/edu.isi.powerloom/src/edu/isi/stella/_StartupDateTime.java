//  -*- Mode: Java -*-
//
// _StartupDateTime.java

/*
+---------------------------- BEGIN LICENSE BLOCK ---------------------------+
|                                                                            |
| Version: MPL 1.1/GPL 2.0/LGPL 2.1                                          |
|                                                                            |
| The contents of this file are subject to the Mozilla Public License        |
| Version 1.1 (the "License"); you may not use this file except in           |
| compliance with the License. You may obtain a copy of the License at       |
| http://www.mozilla.org/MPL/                                                |
|                                                                            |
| Software distributed under the License is distributed on an "AS IS" basis, |
| WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License   |
| for the specific language governing rights and limitations under the       |
| License.                                                                   |
|                                                                            |
| The Original Code is the STELLA Programming Language.                      |
|                                                                            |
| The Initial Developer of the Original Code is                              |
| UNIVERSITY OF SOUTHERN CALIFORNIA, INFORMATION SCIENCES INSTITUTE          |
| 4676 Admiralty Way, Marina Del Rey, California 90292, U.S.A.               |
|                                                                            |
| Portions created by the Initial Developer are Copyright (C) 1996-2012      |
| the Initial Developer. All Rights Reserved.                                |
|                                                                            |
| Contributor(s):                                                            |
|                                                                            |
| Alternatively, the contents of this file may be used under the terms of    |
| either the GNU General Public License Version 2 or later (the "GPL"), or   |
| the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),   |
| in which case the provisions of the GPL or the LGPL are applicable instead |
| of those above. If you wish to allow use of your version of this file only |
| under the terms of either the GPL or the LGPL, and not to allow others to  |
| use your version of this file under the terms of the MPL, indicate your    |
| decision by deleting the provisions above and replace them with the notice |
| and other provisions required by the GPL or the LGPL. If you do not delete |
| the provisions above, a recipient may use your version of this file under  |
| the terms of any one of the MPL, the GPL or the LGPL.                      |
|                                                                            |
+---------------------------- END LICENSE BLOCK -----------------------------+
*/

package edu.isi.stella;

import edu.isi.stella.javalib.*;

public class _StartupDateTime {
  static void helpStartupDateTime1() {
    {
      Stella.KWD_MONDAY = ((Keyword)(GeneralizedSymbol.internRigidSymbolWrtModule("MONDAY", null, 2)));
      Stella.KWD_TUESDAY = ((Keyword)(GeneralizedSymbol.internRigidSymbolWrtModule("TUESDAY", null, 2)));
      Stella.KWD_WEDNESDAY = ((Keyword)(GeneralizedSymbol.internRigidSymbolWrtModule("WEDNESDAY", null, 2)));
      Stella.KWD_THURSDAY = ((Keyword)(GeneralizedSymbol.internRigidSymbolWrtModule("THURSDAY", null, 2)));
      Stella.KWD_FRIDAY = ((Keyword)(GeneralizedSymbol.internRigidSymbolWrtModule("FRIDAY", null, 2)));
      Stella.KWD_SATURDAY = ((Keyword)(GeneralizedSymbol.internRigidSymbolWrtModule("SATURDAY", null, 2)));
      Stella.KWD_SUNDAY = ((Keyword)(GeneralizedSymbol.internRigidSymbolWrtModule("SUNDAY", null, 2)));
      Stella.KWD_NEW_MOON = ((Keyword)(GeneralizedSymbol.internRigidSymbolWrtModule("NEW-MOON", null, 2)));
      Stella.KWD_FIRST_QUARTER = ((Keyword)(GeneralizedSymbol.internRigidSymbolWrtModule("FIRST-QUARTER", null, 2)));
      Stella.KWD_FULL_MOON = ((Keyword)(GeneralizedSymbol.internRigidSymbolWrtModule("FULL-MOON", null, 2)));
      Stella.KWD_LAST_QUARTER = ((Keyword)(GeneralizedSymbol.internRigidSymbolWrtModule("LAST-QUARTER", null, 2)));
      Stella.SGT_STELLA_DECODED_DATE_TIME = ((Surrogate)(GeneralizedSymbol.internRigidSymbolWrtModule("DECODED-DATE-TIME", null, 1)));
      Stella.SYM_STELLA_DATE_TIME_MILLIS = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("DATE-TIME-MILLIS", null, 0)));
      Stella.SYM_STELLA_DATE_TIME_SECOND = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("DATE-TIME-SECOND", null, 0)));
      Stella.SYM_STELLA_DATE_TIME_MINUTE = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("DATE-TIME-MINUTE", null, 0)));
      Stella.SYM_STELLA_DATE_TIME_HOUR = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("DATE-TIME-HOUR", null, 0)));
      Stella.SYM_STELLA_DATE_TIME_DAY = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("DATE-TIME-DAY", null, 0)));
      Stella.SYM_STELLA_DATE_TIME_MONTH = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("DATE-TIME-MONTH", null, 0)));
      Stella.SYM_STELLA_DATE_TIME_YEAR = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("DATE-TIME-YEAR", null, 0)));
      Stella.SYM_STELLA_DATE_TIME_ZONE = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("DATE-TIME-ZONE", null, 0)));
      Stella.SYM_STELLA_DATE_TIME_DOW = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("DATE-TIME-DOW", null, 0)));
      Stella.SGT_STELLA_DECODED_TIME_DURATION = ((Surrogate)(GeneralizedSymbol.internRigidSymbolWrtModule("DECODED-TIME-DURATION", null, 1)));
      Stella.SYM_STELLA_DURATION_MILLIS = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("DURATION-MILLIS", null, 0)));
      Stella.SYM_STELLA_DURATION_SECONDS = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("DURATION-SECONDS", null, 0)));
      Stella.SYM_STELLA_DURATION_MINUTES = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("DURATION-MINUTES", null, 0)));
      Stella.SYM_STELLA_DURATION_HOURS = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("DURATION-HOURS", null, 0)));
      Stella.SYM_STELLA_DURATION_DAYS = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("DURATION-DAYS", null, 0)));
      Stella.SGT_STELLA_CALENDAR_DATE = ((Surrogate)(GeneralizedSymbol.internRigidSymbolWrtModule("CALENDAR-DATE", null, 1)));
      Stella.SYM_STELLA_MODIFIED_JULIAN_DAY = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("MODIFIED-JULIAN-DAY", null, 0)));
      Stella.SYM_STELLA_TIME_MILLIS = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("TIME-MILLIS", null, 0)));
      Stella.SGT_STELLA_TIME_DURATION = ((Surrogate)(GeneralizedSymbol.internRigidSymbolWrtModule("TIME-DURATION", null, 1)));
      Stella.SYM_STELLA_DAYS = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("DAYS", null, 0)));
      Stella.SYM_STELLA_MILLIS = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("MILLIS", null, 0)));
      Stella.SGT_STELLA_NUMBER_WRAPPER = ((Surrogate)(GeneralizedSymbol.internRigidSymbolWrtModule("NUMBER-WRAPPER", null, 1)));
      Stella.SYM_STELLA_INCOMPATIBLE_QUANTITY_EXCEPTION = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("INCOMPATIBLE-QUANTITY-EXCEPTION", null, 0)));
      Stella.SYM_STELLA_T1 = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("T1", null, 0)));
      Stella.SYM_STELLA_T2 = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("T2", null, 0)));
      Stella.SYM_STELLA_CALENDAR_DATE = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("CALENDAR-DATE", null, 0)));
      Stella.SYM_STELLA_TIME_DURATION = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("TIME-DURATION", null, 0)));
      Stella.SYM_STELLA_STARTUP_DATE_TIME = ((Symbol)(GeneralizedSymbol.internRigidSymbolWrtModule("STARTUP-DATE-TIME", null, 0)));
    }
  }

  static void helpStartupDateTime2() {
    {
      Stella.defineFunctionObject("COMPUTE-JULIAN-DAY", "(DEFUN (COMPUTE-JULIAN-DAY INTEGER) ((YYYY INTEGER) (MM INTEGER) (DD INTEGER)) :PUBLIC? TRUE :DOCUMENTATION \"Returns the Julian day that starts at noon on yyyy-mm-dd.\n`yyyy' is the year.  `mm' is the month.  `dd' is the day of month.\nNegative years are B.C.  Remember there is no year zero.\")", Native.find_java_method("edu.isi.stella.Stella", "computeJulianDay", new java.lang.Class [] {java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE}), null);
      Stella.defineFunctionObject("JULIAN-DAY-TO-MODIFIED-JULIAN-DAY", "(DEFUN (JULIAN-DAY-TO-MODIFIED-JULIAN-DAY INTEGER) ((JULIAN-DAY INTEGER)) :PUBLIC? TRUE :DOCUMENTATION \"Returns the modified Julian day during which `julian-day'starts at noon.\")", Native.find_java_method("edu.isi.stella.Stella", "julianDayToModifiedJulianDay", new java.lang.Class [] {java.lang.Integer.TYPE}), null);
      Stella.defineFunctionObject("MODIFIED-JULIAN-DAY-TO-JULIAN-DAY", "(DEFUN (MODIFIED-JULIAN-DAY-TO-JULIAN-DAY INTEGER) ((MODIFIED-JULIAN-DAY INTEGER)) :PUBLIC? TRUE :DOCUMENTATION \"Returns the modified Julian day during which `julian-day'starts at noon.\")", Native.find_java_method("edu.isi.stella.Stella", "modifiedJulianDayToJulianDay", new java.lang.Class [] {java.lang.Integer.TYPE}), null);
      Stella.defineFunctionObject("COMPUTE-DAY-OF-WEEK-JULIAN", "(DEFUN (COMPUTE-DAY-OF-WEEK-JULIAN KEYWORD) ((JULIAN-DAY INTEGER)) :PUBLIC? TRUE :DOCUMENTATION \"Returns the day of the week for julian-day\")", Native.find_java_method("edu.isi.stella.Stella", "computeDayOfWeekJulian", new java.lang.Class [] {java.lang.Integer.TYPE}), null);
      Stella.defineFunctionObject("COMPUTE-DAY-OF-WEEK", "(DEFUN (COMPUTE-DAY-OF-WEEK KEYWORD) ((YYYY INTEGER) (MM INTEGER) (DD INTEGER)) :PUBLIC? TRUE :DOCUMENTATION \"Returns the day of the week for yyyy-mm-dd.\")", Native.find_java_method("edu.isi.stella.Stella", "computeDayOfWeek", new java.lang.Class [] {java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE}), null);
      Stella.defineFunctionObject("COMPUTE-NEXT-MOON-PHASE", "(DEFUN (COMPUTE-NEXT-MOON-PHASE INTEGER FLOAT) ((N INTEGER) (PHASE KEYWORD)) :PUBLIC? TRUE :DOCUMENTATION \"Returns the Julian Day and fraction of day of the Nth occurence\nsince January 1, 1900 of moon PHASE.  PHASE is one of :NEW-MOON, :FIRST-QUARTER,\n:FULL-MOON, :LAST-QUARTER\")", Native.find_java_method("edu.isi.stella.Stella", "computeNextMoonPhase", new java.lang.Class [] {java.lang.Integer.TYPE, Native.find_java_class("edu.isi.stella.Keyword"), Native.find_java_class("[Ljava.lang.Object;")}), null);
      Stella.defineFunctionObject("COMPUTE-CALENDAR-DATE", "(DEFUN (COMPUTE-CALENDAR-DATE INTEGER INTEGER INTEGER KEYWORD) ((JULIAN-DAY INTEGER)) :PUBLIC? TRUE :DOCUMENTATION \"Returns the YEAR, MONTH, DAY, DAY-OF-WEEK on which the given\n`julian-day' begins at noon.\")", Native.find_java_method("edu.isi.stella.Stella", "computeCalendarDate", new java.lang.Class [] {java.lang.Integer.TYPE, Native.find_java_class("[Ljava.lang.Object;")}), null);
      Stella.defineFunctionObject("GET-CURRENT-DATE-TIME", "(DEFUN (GET-CURRENT-DATE-TIME INTEGER INTEGER INTEGER KEYWORD INTEGER INTEGER INTEGER INTEGER) () :PUBLIC? TRUE :DOCUMENTATION \"Returns the current time in UTC as multiple values of\nyear month day day-of-week hour minute second millisecond.  Currently\nmillisecond will always be zero (even in Java where it is technically available).\")", Native.find_java_method("edu.isi.stella.Stella", "getCurrentDateTime", new java.lang.Class [] {Native.find_java_class("[Ljava.lang.Object;")}), null);
      Stella.defineFunctionObject("GET-LOCAL-TIME-ZONE", "(DEFUN (GET-LOCAL-TIME-ZONE FLOAT) () :PUBLIC? TRUE :DOCUMENTATION \"Returns the current time zone offset from UTC as a float,\nconsidering the effects of daylight savings time.\")", Native.find_java_method("edu.isi.stella.Stella", "getLocalTimeZone", new java.lang.Class [] {}), null);
      Stella.defineFunctionObject("GET-LOCAL-STANDARD-TIME-ZONE", "(DEFUN (GET-LOCAL-STANDARD-TIME-ZONE FLOAT) () :PUBLIC? TRUE :DOCUMENTATION \"Returns the standard time zone offset from UTC as a float,\nwithout considering the effects of daylight savings time.\")", Native.find_java_method("edu.isi.stella.Stella", "getLocalStandardTimeZone", new java.lang.Class [] {}), null);
      Stella.defineFunctionObject("GET-LOCAL-TIME-ZONE-FOR-DATE", "(DEFUN (GET-LOCAL-TIME-ZONE-FOR-DATE FLOAT) ((YEAR INTEGER) (MONTH INTEGER) (DAY INTEGER) (HOUR INTEGER) (MINUTE INTEGER) (SECOND INTEGER)) :PUBLIC? TRUE :DOCUMENTATION \"Returns the time zone offset from UTC (as a float)\nthat is applicable to the given date.  Assumes that the date is one\nthat is valid for the underlying programming language.  If not, then\nreturns 0.0\")", Native.find_java_method("edu.isi.stella.Stella", "getLocalTimeZoneForDate", new java.lang.Class [] {java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE}), null);
      Stella.defineFunctionObject("TIME-ZONE-FORMAT60", "(DEFUN (TIME-ZONE-FORMAT60 STRING) ((TIMEZONE FLOAT) (INCLUDE-COLON? BOOLEAN)) :PUBLIC? FALSE :DOCUMENTATION \"Format `zone' as an hh:mm or hhmm string depending on `include-colon?'\")", Native.find_java_method("edu.isi.stella.Stella", "timeZoneFormat60", new java.lang.Class [] {java.lang.Double.TYPE, java.lang.Boolean.TYPE}), null);
      Stella.defineMethodObject("(DEFMETHOD (HASH-CODE INTEGER) ((SELF DECODED-DATE-TIME)) :PUBLIC? TRUE :GLOBALLY-INLINE? TRUE (RETURN (LOGXOR (LOGOR (LOGOR (SHIFT-LEFT (DATE-TIME-YEAR SELF) 9) (SHIFT-LEFT (DATE-TIME-MONTH SELF) 5)) (DATE-TIME-DAY SELF)) (LOGOR (LOGOR (SHIFT-LEFT (DATE-TIME-HOUR SELF) 12) (SHIFT-LEFT (DATE-TIME-MINUTE SELF) 6)) (DATE-TIME-SECOND SELF)))))", Native.find_java_method("edu.isi.stella.DecodedDateTime", "hashCode_", new java.lang.Class [] {}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD SET-CURRENT-TIME ((VALUES-STRUCTURE DECODED-DATE-TIME)) :PUBLIC? TRUE :DOCUMENTATION \"Sets the current time into `values-structure'\")", Native.find_java_method("edu.isi.stella.DecodedDateTime", "setCurrentTime", new java.lang.Class [] {}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD SET-CURRENT-DATE ((VALUES-STRUCTURE DECODED-DATE-TIME)) :PUBLIC? TRUE :DOCUMENTATION \"Sets the current date into `values-structure'\")", Native.find_java_method("edu.isi.stella.DecodedDateTime", "setCurrentDate", new java.lang.Class [] {}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD SET-CURRENT-DATE-TIME ((VALUES-STRUCTURE DECODED-DATE-TIME)) :PUBLIC? TRUE :DOCUMENTATION \"Sets the current date and time into `values-structure'\")", Native.find_java_method("edu.isi.stella.DecodedDateTime", "setCurrentDateTime", new java.lang.Class [] {}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (DECODED-DATE-TIME-TO-ISO8601-STRING STRING) ((DATE DECODED-DATE-TIME)) :PUBLIC? TRUE :DOCUMENTATION \"Returns an ISO-8601 string representation of `date'\nThe Format is YYYY-MM-DDThh:mm:ss+zz:zz, with the string stopping at\nwhen a null value is first encountered.  The time zone will only\nbe included (if present) if a time value is given.\")", Native.find_java_method("edu.isi.stella.DecodedDateTime", "decodedDateTimeToIso8601String", new java.lang.Class [] {}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD SET-CONSISTENT-DOW ((SELF DECODED-DATE-TIME)) :PUBLIC? FALSE)", Native.find_java_method("edu.isi.stella.DecodedDateTime", "setConsistentDow", new java.lang.Class [] {}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD HELP-MERGE-NULL-FIELDS ((SELF DECODED-DATE-TIME) (DEFAULT DECODED-DATE-TIME) (INDEX INTEGER)) :PUBLIC? FALSE)", Native.find_java_method("edu.isi.stella.DecodedDateTime", "helpMergeNullFields", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.DecodedDateTime"), java.lang.Integer.TYPE}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD MERGE-NULL-FIELDS ((SELF DECODED-DATE-TIME) (DEFAULT DECODED-DATE-TIME)) :PUBLIC? TRUE :DOCUMENTATION \"Replace any null valued fields in `self' with values from `default'.\nThe day of the week will be set consistently, if possible.\")", Native.find_java_method("edu.isi.stella.DecodedDateTime", "mergeNullFields", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.DecodedDateTime")}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD MERGE-SUPERIOR-NULL-FIELDS ((SELF DECODED-DATE-TIME) (DEFAULT DECODED-DATE-TIME)) :PUBLIC? TRUE :DOCUMENTATION \"Replace only null valued fields in `self' that represent larger\ntime units than the smallest non-null in `self' with values from `default'.\nThe day of the week will be set consistently, if possible.\nExample: if `self' just has the month being non-null, then only the year\nwill be filled in from `default'.  If the day and minute were non-null,\nthen hour, month and year will be filled.\n\nThis can be useful when one doesn't want to extend the precision\nof the answer.\")", Native.find_java_method("edu.isi.stella.DecodedDateTime", "mergeSuperiorNullFields", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.DecodedDateTime")}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (HASH-CODE INTEGER) ((SELF DECODED-TIME-DURATION)) :PUBLIC? TRUE :GLOBALLY-INLINE? TRUE (RETURN (LOGXOR (DURATION-DAYS SELF) (LOGOR (LOGOR (SHIFT-LEFT (DURATION-HOURS SELF) 12) (SHIFT-LEFT (DURATION-MINUTES SELF) 6)) (DURATION-SECONDS SELF)))))", Native.find_java_method("edu.isi.stella.DecodedTimeDuration", "hashCode_", new java.lang.Class [] {}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (COERCE-TO CALENDAR-DATE) ((X CALENDAR-DATE) (Y OBJECT)))", Native.find_java_method("edu.isi.stella.CalendarDate", "coerceTo", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.Stella_Object")}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (HASH-CODE INTEGER) ((SELF CALENDAR-DATE)) :PUBLIC? TRUE :GLOBALLY-INLINE? TRUE (RETURN (LOGXOR (MODIFIED-JULIAN-DAY SELF) (TIME-MILLIS SELF))))", Native.find_java_method("edu.isi.stella.CalendarDate", "hashCode_", new java.lang.Class [] {}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (CALENDAR-DATE-TO-DATE-STRING STRING) ((DATE CALENDAR-DATE) (TIMEZONE FLOAT) (NUMERIC-MONTH? BOOLEAN)) :PUBLIC? TRUE :DOCUMENTATION \"Returns the date part of the string representation of `date' \nadjusted for `timezone'.  Format is YYYY-MMM-DD, where MMM is a three letter\nEnglish abbreviation of the month if `numeric-month?' is `false' and a two\ndigit numeric value if `numeric-month?' is `true'.  The value `false' is\nrecommended.\")", Native.find_java_method("edu.isi.stella.CalendarDate", "calendarDateToDateString", new java.lang.Class [] {java.lang.Double.TYPE, java.lang.Boolean.TYPE}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (CALENDAR-DATE-TO-TIME-STRING STRING) ((DATE CALENDAR-DATE) (TIMEZONE FLOAT) (INCLUDE-TIMEZONE? BOOLEAN) (INCLUDE-MILLIS? BOOLEAN) (PAD-HOURS? BOOLEAN)) :PUBLIC? TRUE :DOCUMENTATION \"Returns the time part of the string representation of `date'\nadjusted for `timezone'.  The timezone is included in the string if\n`include-timezone?' is `true'.  The value `true' is recommended.\nMilliseconds will be included if `include-millis?' is `true'.\nHours will be zero-padded to length 2 if `pad-hours?' is `true'.\n\")", Native.find_java_method("edu.isi.stella.CalendarDate", "calendarDateToTimeString", new java.lang.Class [] {java.lang.Double.TYPE, java.lang.Boolean.TYPE, java.lang.Boolean.TYPE, java.lang.Boolean.TYPE}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (CALENDAR-DATE-TO-STRING STRING) ((DATE CALENDAR-DATE) (TIMEZONE FLOAT) (NUMERIC-MONTH? BOOLEAN) (INCLUDE-TIMEZONE? BOOLEAN)) :PUBLIC? TRUE :DOCUMENTATION \"Returns a string representation of `date' adjusted for `timezone'.\nThe Format is YYYY-MMM-DD hh:mm:ss z.z, where MMM is a three letter\nEnglish abbreviation of the month if `numeric-month?' is `false' and a two\ndigit numeric value if `numeric-month?' is `true'.  The timezone as a\nfloat offset z.z is included if `include-timezone?' is `true'.\n\nRecommended values for the flags are `false' and `true' respectively.\")", Native.find_java_method("edu.isi.stella.CalendarDate", "calendarDateToString", new java.lang.Class [] {java.lang.Double.TYPE, java.lang.Boolean.TYPE, java.lang.Boolean.TYPE}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (CALENDAR-DATE-TO-ISO8601-STRING STRING) ((DATE CALENDAR-DATE) (TIMEZONE FLOAT) (INCLUDE-TIMEZONE? BOOLEAN)) :PUBLIC? TRUE :DOCUMENTATION \"Returns an ISO-8601 string representation of `date' adjusted for `timezone'.\nThe Format is YYYY-MM-DDThh:mm:ss z:zz.  The timezone as an offset\nhh:mm is included if `include-timezone?' is `true'.\n\nRecommended values for the flag is `true'.\")", Native.find_java_method("edu.isi.stella.CalendarDate", "calendarDateToIso8601String", new java.lang.Class [] {java.lang.Double.TYPE, java.lang.Boolean.TYPE}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (CALENDAR-DATE-TO-NATIVE-DATE-TIME NATIVE-DATE-TIME) ((DATE CALENDAR-DATE)))", Native.find_java_method("edu.isi.stella.CalendarDate", "calendarDateToNativeDateTime", new java.lang.Class [] {}), ((java.lang.reflect.Method)(null)));
      Stella.defineFunctionObject("NATIVE-DATE-TIME-TO-CALENDAR-DATE", "(DEFUN (NATIVE-DATE-TIME-TO-CALENDAR-DATE CALENDAR-DATE) ((DATE NATIVE-DATE-TIME)) :CONSTRUCTOR? TRUE)", Native.find_java_method("edu.isi.stella.CalendarDate", "nativeDateTimeToCalendarDate", new java.lang.Class [] {java.lang.Long.TYPE}), null);
      Stella.defineMethodObject("(DEFMETHOD PRINT-CALENDAR-DATE ((DATE CALENDAR-DATE) (STREAM NATIVE-OUTPUT-STREAM)))", Native.find_java_method("edu.isi.stella.CalendarDate", "printCalendarDate", new java.lang.Class [] {Native.find_java_class("org.powerloom.PrintableStringWriter")}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (COERCE-TO TIME-DURATION) ((X TIME-DURATION) (Y OBJECT)))", Native.find_java_method("edu.isi.stella.TimeDuration", "coerceTo", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.Stella_Object")}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (HASH-CODE INTEGER) ((SELF TIME-DURATION)) :PUBLIC? TRUE :GLOBALLY-INLINE? TRUE (RETURN (LOGXOR (DAYS SELF) (MILLIS SELF))))", Native.find_java_method("edu.isi.stella.TimeDuration", "hashCode_", new java.lang.Class [] {}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (TIME-DURATION-TO-STRING STRING) ((DATE TIME-DURATION)) :PUBLIC? TRUE :DOCUMENTATION \"Returns a string representation of `date'\")", Native.find_java_method("edu.isi.stella.TimeDuration", "timeDurationToString", new java.lang.Class [] {}), ((java.lang.reflect.Method)(null)));
      Stella.defineFunctionObject("STRING-TO-TIME-DURATION", "(DEFUN (STRING-TO-TIME-DURATION TIME-DURATION) ((DURATION STRING)) :PUBLIC? TRUE :CONSTRUCTOR? TRUE :DOCUMENTATION \"Parses and returns an time-duration object corresponding to `duration'.\nThe syntax for time duration strings is \\\"{plus|minus} N days[; M ms]\\\" where N and M are\ninteger values for days and milliseconds.  If no valid parse is found, `null' is returned.\")", Native.find_java_method("edu.isi.stella.TimeDuration", "stringToTimeDuration", new java.lang.Class [] {Native.find_java_class("java.lang.String")}), null);
      Stella.defineMethodObject("(DEFMETHOD PRINT-TIME-DURATION ((DATE TIME-DURATION) (STREAM NATIVE-OUTPUT-STREAM)))", Native.find_java_method("edu.isi.stella.TimeDuration", "printTimeDuration", new java.lang.Class [] {Native.find_java_class("org.powerloom.PrintableStringWriter")}), ((java.lang.reflect.Method)(null)));
      Stella.defineFunctionObject("MAKE-DATE-TIME", "(DEFUN (MAKE-DATE-TIME CALENDAR-DATE) ((YEAR INTEGER) (MONTH INTEGER) (DAY INTEGER) (HOUR INTEGER) (MINUTE INTEGER) (SECOND INTEGER) (MILLIS INTEGER) (TIMEZONE FLOAT)) :PUBLIC? TRUE :CONSTRUCTOR? TRUE :DOCUMENTATION \"Create a calendar date with the specified components.  `year' must be\nthe complete year (i.e., a year of 98 is 98 A.D in the 1st century).\n`timezone' is a real number in the range -12.0 to +14.0 where UTC is zone 0.0;  The number\nis the number of hours to add to UTC to arrive at local time.\")", Native.find_java_method("edu.isi.stella.CalendarDate", "makeDateTime", new java.lang.Class [] {java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Double.TYPE}), null);
      Stella.defineFunctionObject("MAKE-CURRENT-DATE-TIME", "(DEFUN (MAKE-CURRENT-DATE-TIME CALENDAR-DATE) () :PUBLIC? TRUE :CONSTRUCTOR? TRUE :DOCUMENTATION \"Create a calendar date with current time and date.\")", Native.find_java_method("edu.isi.stella.CalendarDate", "makeCurrentDateTime", new java.lang.Class [] {}), null);
      Stella.defineFunctionObject("MAKE-CALENDAR-DATE", "(DEFUN (MAKE-CALENDAR-DATE CALENDAR-DATE) ((DAY INTEGER) (TIME INTEGER)) :CONSTRUCTOR? TRUE)", Native.find_java_method("edu.isi.stella.CalendarDate", "makeCalendarDate", new java.lang.Class [] {java.lang.Integer.TYPE, java.lang.Integer.TYPE}), null);
      Stella.defineFunctionObject("MAKE-TIME-DURATION", "(DEFUN (MAKE-TIME-DURATION TIME-DURATION) ((DAYS INTEGER) (MILLIS INTEGER)) :CONSTRUCTOR? TRUE)", Native.find_java_method("edu.isi.stella.TimeDuration", "makeTimeDuration", new java.lang.Class [] {java.lang.Integer.TYPE, java.lang.Integer.TYPE}), null);
      Stella.defineFunctionObject("DECODE-TIME-IN-MILLIS", "(DEFUN (DECODE-TIME-IN-MILLIS INTEGER INTEGER INTEGER INTEGER) ((TIME INTEGER)) :PUBLIC? TRUE :DOCUMENTATION \"Returns multiple values of hours, minutes, seconds, milliseconds for\n`time' specified in milliseconds.\")", Native.find_java_method("edu.isi.stella.Stella", "decodeTimeInMillis", new java.lang.Class [] {java.lang.Integer.TYPE, Native.find_java_class("[Ljava.lang.Object;")}), null);
      Stella.defineMethodObject("(DEFMETHOD (GET-CALENDAR-DATE INTEGER INTEGER INTEGER KEYWORD) ((DATE CALENDAR-DATE) (TIMEZONE FLOAT)) :PUBLIC? TRUE :DOCUMENTATION \"Returns multiple values of year, month, day and day of week for `date'\nin `timezone'.  `timezone' is the number of hours added to UTC to get local time.  It\nis in the range -12.0 to +14.0 where UTC is zone 0.0\")", Native.find_java_method("edu.isi.stella.CalendarDate", "getCalendarDate", new java.lang.Class [] {java.lang.Double.TYPE, Native.find_java_class("[Ljava.lang.Object;")}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (GET-TIME INTEGER INTEGER INTEGER INTEGER) ((DATE CALENDAR-DATE) (TIMEZONE FLOAT)) :PUBLIC? TRUE :DOCUMENTATION \"Returns multiple values of hours, minutes, seconds, milliseconds for\nthe calendar date `date' in `timezone'.  `timezone' is the number of hours added to UTC\nto get local time.  It is in the range -12.0 to +14.0 where UTC is zone 0.0\")", Native.find_java_method("edu.isi.stella.CalendarDate", "getTime", new java.lang.Class [] {java.lang.Double.TYPE, Native.find_java_class("[Ljava.lang.Object;")}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (DECODE-CALENDAR-DATE DECODED-DATE-TIME) ((DATE CALENDAR-DATE) (TIMEZONE FLOAT)) :PUBLIC? TRUE :DOCUMENTATION \"Returns a decoded time object for `date' interpreted in `timezone'\n`timezone' is the number of hours added to UTC to get local time.  It is \nin the range -12.0 to +14.0 where UTC is zone 0.0\")", Native.find_java_method("edu.isi.stella.CalendarDate", "decodeCalendarDate", new java.lang.Class [] {java.lang.Double.TYPE}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (ENCODE-CALENDAR-DATE CALENDAR-DATE) ((TIME-STRUCTURE DECODED-DATE-TIME)) :PUBLIC? TRUE :DOCUMENTATION \"Returns a calendar date object for `time-structure'.\")", Native.find_java_method("edu.isi.stella.DecodedDateTime", "encodeCalendarDate", new java.lang.Class [] {}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (DECODE-TIME-DURATION DECODED-TIME-DURATION) ((DURATION TIME-DURATION)))", Native.find_java_method("edu.isi.stella.TimeDuration", "decodeTimeDuration", new java.lang.Class [] {}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (ENCODE-TIME-DURATION TIME-DURATION) ((TIME-STRUCTURE DECODED-TIME-DURATION)))", Native.find_java_method("edu.isi.stella.DecodedTimeDuration", "encodeTimeDuration", new java.lang.Class [] {}), ((java.lang.reflect.Method)(null)));
      Stella.defineFunctionObject("TIME-ADD", "(DEFUN (TIME-ADD DATE-TIME-OBJECT) ((T1 DATE-TIME-OBJECT) (T2 DATE-TIME-OBJECT)) :PUBLIC? TRUE :DOCUMENTATION \"Add `t1' to `t2'.\nIf one of `t1' or `t2' is a calendar date, then the result is a calendar date.\nIf both `t1' and `t2' are relative dates, then the result is a relative date.\n`t1' and `t2' cannot both be calendar dates.\")", Native.find_java_method("edu.isi.stella.DateTimeObject", "timeAdd", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.DateTimeObject"), Native.find_java_class("edu.isi.stella.DateTimeObject")}), null);
      Stella.defineFunctionObject("TIME-SUBTRACT", "(DEFUN (TIME-SUBTRACT DATE-TIME-OBJECT) ((T1 DATE-TIME-OBJECT) (T2 DATE-TIME-OBJECT)) :PUBLIC? TRUE :DOCUMENTATION \"Subtract `t2' from `t1'.  If `t1' is a calendar date, then `t2' can\nbe either a calendar date (in which case the return value is a relative date) or it\ncan be a relative date (in which case the return value is a calendar date).  If `t1'\nis a relative date, then `t2' must also be a relative date and a relative date is returned.\")", Native.find_java_method("edu.isi.stella.DateTimeObject", "timeSubtract", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.DateTimeObject"), Native.find_java_class("edu.isi.stella.DateTimeObject")}), null);
      Stella.defineFunctionObject("TIME-MULTIPLY", "(DEFUN (TIME-MULTIPLY TIME-DURATION) ((T1 OBJECT) (T2 OBJECT)) :PUBLIC? TRUE :DOCUMENTATION \"Multiplies a relative date by a wrapped number.  One of `t1' or `t2'\nmust be a relative date and the other a wrapped number.\")", Native.find_java_method("edu.isi.stella.Stella_Object", "timeMultiply", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.Stella_Object"), Native.find_java_class("edu.isi.stella.Stella_Object")}), null);
      Stella.defineFunctionObject("TIME-DIVIDE", "(DEFUN (TIME-DIVIDE OBJECT) ((T1 TIME-DURATION) (T2 OBJECT)) :PUBLIC? TRUE :DOCUMENTATION \"Divides the relative date `t1' by `t2'.  `t2' must be\neither a relative date or a wrapped number.  If `t2' is a relative date,\nthen the return value will be a wrapped float.  If `t2' is a wrapped number,\nthen the reutrn value will be a relative date.\")", Native.find_java_method("edu.isi.stella.TimeDuration", "timeDivide", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.TimeDuration"), Native.find_java_class("edu.isi.stella.Stella_Object")}), null);
      Stella.defineFunctionObject("DEFINE-TIME-COMPARISON", "(DEFUN DEFINE-TIME-COMPARISON ((NAME SYMBOL) (OPERATOR SYMBOL) (ERROR? SYMBOL)) :TYPE OBJECT :MACRO? TRUE :PUBLIC? FALSE)", Native.find_java_method("edu.isi.stella.Symbol", "defineTimeComparison", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.Symbol"), Native.find_java_class("edu.isi.stella.Symbol"), Native.find_java_class("edu.isi.stella.Symbol")}), null);
      Stella.defineMethodObject("(DEFMETHOD (OBJECT-EQL? BOOLEAN) ((T1 CALENDAR-DATE) (T2 OBJECT)))", Native.find_java_method("edu.isi.stella.CalendarDate", "objectEqlP", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.Stella_Object")}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (OBJECT-EQL? BOOLEAN) ((T1 TIME-DURATION) (T2 OBJECT)))", Native.find_java_method("edu.isi.stella.TimeDuration", "objectEqlP", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.Stella_Object")}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (LESS? BOOLEAN) ((T1 CALENDAR-DATE) (T2 OBJECT)))", Native.find_java_method("edu.isi.stella.CalendarDate", "lessP", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.Stella_Object")}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (LESS? BOOLEAN) ((T1 TIME-DURATION) (T2 OBJECT)))", Native.find_java_method("edu.isi.stella.TimeDuration", "lessP", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.Stella_Object")}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (GREATER? BOOLEAN) ((T1 CALENDAR-DATE) (T2 OBJECT)))", Native.find_java_method("edu.isi.stella.CalendarDate", "greaterP", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.Stella_Object")}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (GREATER? BOOLEAN) ((T1 TIME-DURATION) (T2 OBJECT)))", Native.find_java_method("edu.isi.stella.TimeDuration", "greaterP", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.Stella_Object")}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (LESS-EQUAL? BOOLEAN) ((T1 CALENDAR-DATE) (T2 OBJECT)))", Native.find_java_method("edu.isi.stella.CalendarDate", "lessEqualP", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.Stella_Object")}), ((java.lang.reflect.Method)(null)));
      Stella.defineMethodObject("(DEFMETHOD (LESS-EQUAL? BOOLEAN) ((T1 TIME-DURATION) (T2 OBJECT)))", Native.find_java_method("edu.isi.stella.TimeDuration", "lessEqualP", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.Stella_Object")}), ((java.lang.reflect.Method)(null)));
    }
  }

  public static void startupDateTime() {
    { Object old$Module$000 = Stella.$MODULE$.get();
      Object old$Context$000 = Stella.$CONTEXT$.get();

      try {
        Native.setSpecial(Stella.$MODULE$, Stella.$STELLA_MODULE$);
        Native.setSpecial(Stella.$CONTEXT$, ((Module)(Stella.$MODULE$.get())));
        if (Stella.currentStartupTimePhaseP(2)) {
          _StartupDateTime.helpStartupDateTime1();
        }
        if (Stella.currentStartupTimePhaseP(4)) {
          Stella.MILLIS_PER_DAY = 1000 * 60 * 60 * 24;
          Stella.MILLIS_PER_HOUR = 1000 * 60 * 60;
          Stella.$MONTH_NAME_VECTOR$ = Vector.newVector(13);
          { int i = Stella.NULL_INTEGER;
            int iter039 = 0;
            int upperBound040 = 12;
            Stella_Object abbreviation = null;
            Cons iter041 = Stella.getQuotedTree("((\"NUL\" \"January\" \"February\" \"March\" \"April\" \"May\" \"June\" \"July\" \"August\" \"September\" \"October\" \"November\" \"December\") \"/STELLA\")", "/STELLA");

            for (;(iter039 <= upperBound040) &&
                      (!(iter041 == Stella.NIL)); iter039 = iter039 + 1, iter041 = iter041.rest) {
              i = iter039;
              abbreviation = iter041.value;
              (Stella.$MONTH_NAME_VECTOR$.theArray)[i] = (((StringWrapper)(abbreviation)));
            }
          }
          Stella.$MONTH_ABBREVIATION_VECTOR$ = Vector.newVector(13);
          { int i = Stella.NULL_INTEGER;
            int iter043 = 0;
            int upperBound044 = 12;
            Stella_Object abbreviation = null;
            Cons iter045 = Stella.getQuotedTree("((\"NUL\" \"JAN\" \"FEB\" \"MAR\" \"APR\" \"MAY\" \"JUN\" \"JUL\" \"AUG\" \"SEP\" \"OCT\" \"NOV\" \"DEC\") \"/STELLA\")", "/STELLA");

            for (;(iter043 <= upperBound044) &&
                      (!(iter045 == Stella.NIL)); iter043 = iter043 + 1, iter045 = iter045.rest) {
              i = iter043;
              abbreviation = iter045.value;
              (Stella.$MONTH_ABBREVIATION_VECTOR$.theArray)[i] = (((StringWrapper)(abbreviation)));
            }
          }
          Stella.$DEFAULT_DECODED_DATE_TIME$ = DecodedDateTime.newDecodedDateTime();
          { DecodedDateTime self047 = DecodedDateTime.newDecodedDateTime();

            self047.dateTimeMillis = Stella.NULL_FLOAT;
            self047.dateTimeSecond = Stella.NULL_INTEGER;
            self047.dateTimeMinute = Stella.NULL_INTEGER;
            self047.dateTimeHour = Stella.NULL_INTEGER;
            self047.dateTimeDay = Stella.NULL_INTEGER;
            self047.dateTimeMonth = Stella.NULL_INTEGER;
            self047.dateTimeYear = Stella.NULL_INTEGER;
            self047.dateTimeZone = Stella.NULL_FLOAT;
            self047.dateTimeDow = null;
            Stella.$NULL_DECODED_DATE_TIME$ = self047;
          }
        }
        if (Stella.currentStartupTimePhaseP(5)) {
          Stella.defineClassFromStringifiedSource("NATIVE-DATE-TIME", "(DEFCLASS NATIVE-DATE-TIME () :PUBLIC? TRUE :DOCUMENTATION \"A data type that is used to hold the native date and time\ninformation.   It is opaque to the Stella users.  It is provided so that\nStella `calendar-date' objects can be translated into and out of native format.\nNote that there is no way to initialize a variable holding a `native-date-time'\nexcept by such a translation.\" :CPP-NATIVE-TYPE \"time_t\" :CL-NATIVE-TYPE \"INTEGER\" :JAVA-NATIVE-TYPE \"long\")");
          { Stella_Class renamed_Class = Stella.defineClassFromStringifiedSource("DECODED-DATE-TIME", "(DEFCLASS DECODED-DATE-TIME (STANDARD-OBJECT) :PUBLIC? TRUE :DOCUMENTATION \"A data structure for holding decoded time values with fields\nfor easy access of the components.\" :PUBLIC-SLOTS ((DATE-TIME-MILLIS :INITIALLY 0.0 :TYPE FLOAT) (DATE-TIME-SECOND :INITIALLY 0 :TYPE INTEGER) (DATE-TIME-MINUTE :INITIALLY 0 :TYPE INTEGER) (DATE-TIME-HOUR :INITIALLY 0 :TYPE INTEGER) (DATE-TIME-DAY :INITIALLY 1 :TYPE INTEGER) (DATE-TIME-MONTH :INITIALLY 1 :TYPE INTEGER) (DATE-TIME-YEAR :INITIALLY 1900 :TYPE INTEGER) (DATE-TIME-ZONE :INITIALLY 0.0 :TYPE FLOAT) (DATE-TIME-DOW :INITIALLY :SUNDAY :TYPE KEYWORD)))");

            renamed_Class.classConstructorCode = Native.find_java_method("edu.isi.stella.DecodedDateTime", "newDecodedDateTime", new java.lang.Class [] {});
            renamed_Class.classSlotAccessorCode = Native.find_java_method("edu.isi.stella.DecodedDateTime", "accessDecodedDateTimeSlotValue", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.DecodedDateTime"), Native.find_java_class("edu.isi.stella.Symbol"), Native.find_java_class("edu.isi.stella.Stella_Object"), java.lang.Boolean.TYPE});
          }
          { Stella_Class renamed_Class = Stella.defineClassFromStringifiedSource("DECODED-TIME-DURATION", "(DEFCLASS DECODED-TIME-DURATION (STANDARD-OBJECT) :PUBLIC? TRUE :DOCUMENTATION \"A data structure for holding decoded time duration values with\nfields for easy access of the components.  Note that all non-zero values\nshould have the same sign.\" :PUBLIC-SLOTS ((DURATION-MILLIS :INITIALLY 0.0 :TYPE FLOAT) (DURATION-SECONDS :INITIALLY 0 :TYPE INTEGER) (DURATION-MINUTES :INITIALLY 0 :TYPE INTEGER) (DURATION-HOURS :INITIALLY 0 :TYPE INTEGER) (DURATION-DAYS :INITIALLY 0 :TYPE INTEGER)))");

            renamed_Class.classConstructorCode = Native.find_java_method("edu.isi.stella.DecodedTimeDuration", "newDecodedTimeDuration", new java.lang.Class [] {});
            renamed_Class.classSlotAccessorCode = Native.find_java_method("edu.isi.stella.DecodedTimeDuration", "accessDecodedTimeDurationSlotValue", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.DecodedTimeDuration"), Native.find_java_class("edu.isi.stella.Symbol"), Native.find_java_class("edu.isi.stella.Stella_Object"), java.lang.Boolean.TYPE});
          }
          Stella.defineClassFromStringifiedSource("DATE-TIME-OBJECT", "(DEFCLASS DATE-TIME-OBJECT (QUANTITY) :ABSTRACT? TRUE)");
          { Stella_Class renamed_Class = Stella.defineClassFromStringifiedSource("CALENDAR-DATE", "(DEFCLASS CALENDAR-DATE (DATE-TIME-OBJECT) :PUBLIC? TRUE :DOCUMENTATION \"Representation of Date and Time with the date represented\nas a modified Julian day (starting at midnight instead of noon) and the\ntime as the offset in milliseconds from midnight, UTC\" :PUBLIC-SLOTS ((MODIFIED-JULIAN-DAY :TYPE INTEGER) (TIME-MILLIS :TYPE INTEGER)) :PRINT-FORM (PRINT-CALENDAR-DATE SELF STREAM))");

            renamed_Class.classConstructorCode = Native.find_java_method("edu.isi.stella.CalendarDate", "newCalendarDate", new java.lang.Class [] {});
            renamed_Class.classSlotAccessorCode = Native.find_java_method("edu.isi.stella.CalendarDate", "accessCalendarDateSlotValue", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.CalendarDate"), Native.find_java_class("edu.isi.stella.Symbol"), Native.find_java_class("edu.isi.stella.Stella_Object"), java.lang.Boolean.TYPE});
          }
          { Stella_Class renamed_Class = Stella.defineClassFromStringifiedSource("TIME-DURATION", "(DEFCLASS TIME-DURATION (DATE-TIME-OBJECT) :PUBLIC? TRUE :DOCUMENTATION \"Representation of Relative Days and Time with the date represented\nas a number of days and the time in milliseconds.\" :PUBLIC-SLOTS ((DAYS :TYPE INTEGER) (MILLIS :TYPE INTEGER)) :PRINT-FORM (PRINT-TIME-DURATION SELF STREAM))");

            renamed_Class.classConstructorCode = Native.find_java_method("edu.isi.stella.TimeDuration", "newTimeDuration", new java.lang.Class [] {});
            renamed_Class.classSlotAccessorCode = Native.find_java_method("edu.isi.stella.TimeDuration", "accessTimeDurationSlotValue", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.TimeDuration"), Native.find_java_class("edu.isi.stella.Symbol"), Native.find_java_class("edu.isi.stella.Stella_Object"), java.lang.Boolean.TYPE});
          }
        }
        if (Stella.currentStartupTimePhaseP(6)) {
          Stella.finalizeClasses();
        }
        if (Stella.currentStartupTimePhaseP(7)) {
          _StartupDateTime.helpStartupDateTime2();
          Stella.defineMethodObject("(DEFMETHOD (GREATER-EQUAL? BOOLEAN) ((T1 CALENDAR-DATE) (T2 OBJECT)))", Native.find_java_method("edu.isi.stella.CalendarDate", "greaterEqualP", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.Stella_Object")}), ((java.lang.reflect.Method)(null)));
          Stella.defineMethodObject("(DEFMETHOD (GREATER-EQUAL? BOOLEAN) ((T1 TIME-DURATION) (T2 OBJECT)))", Native.find_java_method("edu.isi.stella.TimeDuration", "greaterEqualP", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.Stella_Object")}), ((java.lang.reflect.Method)(null)));
          Stella.defineFunctionObject("FILL-IN-DATE-SUBSTITUTION", "(DEFUN FILL-IN-DATE-SUBSTITUTION ((SUBSTITUTION-LIST (KEY-VALUE-LIST OF STRING-WRAPPER STRING-WRAPPER))) :DOCUMENTATION \"Fill in `substitution-list' with template variable substitions\nfor the names YEAR and DATE which correspond to the current year and date.\nThese substitutions can then be used with `substitute-template-variables-in-string'\nDEPRECATED.  Use `add-date-subsitution' or `add-current-date-substitution' instead.\" :PUBLIC? TRUE)", Native.find_java_method("edu.isi.stella.KeyValueList", "fillInDateSubstitution", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.KeyValueList")}), null);
          Stella.defineFunctionObject("ADD-DATE-SUBSTITUTION", "(DEFUN ADD-DATE-SUBSTITUTION ((DATE CALENDAR-DATE) (SUBSTITUTION-LIST (KEY-VALUE-LIST OF STRING-WRAPPER STRING-WRAPPER))) :DOCUMENTATION \"Fill in `substitution-list' with template variable substitions\nfor the names YEAR, MONTH, MON, DAY, HOUR, MINUTE, SECOND, TIMEZONE,\nDAY-OF-WEEK, DOW with their values for `date'.  Also, pre-formatted\nDATE, TIME and ISO8601 variables are set.\n\nTIMEZONE is in the format \\\"{+|-}hhmm\\\".  MONTH is the full English\nmonth name and MON is the numeric month.  DAY-OF-WEEK is an English\nstring and DOW is the first three letters.  Minutes and seconds are\nzero-padded.\n\nThese substitutions can be used with `substitute-template-variables-in-string'\" :PUBLIC? TRUE)", Native.find_java_method("edu.isi.stella.CalendarDate", "addDateSubstitution", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.CalendarDate"), Native.find_java_class("edu.isi.stella.KeyValueList")}), null);
          Stella.defineFunctionObject("ADD-CURRENT-DATE-SUBSTITUTION", "(DEFUN ADD-CURRENT-DATE-SUBSTITUTION ((SUBSTITUTION-LIST (KEY-VALUE-LIST OF STRING-WRAPPER STRING-WRAPPER))) :DOCUMENTATION \"Fill in `substitution-list' with date information for the current\ndate and time.  See `add-date-substitution' for details.\" :PUBLIC? TRUE)", Native.find_java_method("edu.isi.stella.KeyValueList", "addCurrentDateSubstitution", new java.lang.Class [] {Native.find_java_class("edu.isi.stella.KeyValueList")}), null);
          Stella.defineFunctionObject("STARTUP-DATE-TIME", "(DEFUN STARTUP-DATE-TIME () :PUBLIC? TRUE)", Native.find_java_method("edu.isi.stella._StartupDateTime", "startupDateTime", new java.lang.Class [] {}), null);
          { MethodSlot function = Symbol.lookupFunction(Stella.SYM_STELLA_STARTUP_DATE_TIME);

            KeyValueList.setDynamicSlotValue(function.dynamicSlots, Stella.SYM_STELLA_METHOD_STARTUP_CLASSNAME, StringWrapper.wrapString("_StartupDateTime"), Stella.NULL_STRING_WRAPPER);
          }
        }
        if (Stella.currentStartupTimePhaseP(8)) {
          Stella.finalizeSlots();
          Stella.cleanupUnfinalizedClasses();
        }
        if (Stella.currentStartupTimePhaseP(9)) {
          Stella_Object.inModule(((StringWrapper)(Stella_Object.copyConsTree(StringWrapper.wrapString("/STELLA")))));
          Stella.defineStellaGlobalVariableFromStringifiedSource("(DEFCONSTANT MILLIS-PER-DAY INTEGER (* 1000 60 60 24) :PUBLIC? FALSE)");
          Stella.defineStellaGlobalVariableFromStringifiedSource("(DEFCONSTANT MILLIS-PER-HOUR INTEGER (* 1000 60 60) :PUBLIC? FALSE)");
          Stella.defineStellaGlobalVariableFromStringifiedSource("(DEFGLOBAL *MONTH-NAME-VECTOR* (VECTOR OF STRING-WRAPPER) NULL :DOCUMENTATION \"A vector of month names for printing dates\")");
          Stella.defineStellaGlobalVariableFromStringifiedSource("(DEFGLOBAL *MONTH-ABBREVIATION-VECTOR* (VECTOR OF STRING-WRAPPER) NULL :DOCUMENTATION \"A vector of month abbreviations for printing dates\")");
          Stella.defineStellaGlobalVariableFromStringifiedSource("(DEFCONSTANT *DEFAULT-DECODED-DATE-TIME* DECODED-DATE-TIME (NEW DECODED-DATE-TIME))");
          Stella.defineStellaGlobalVariableFromStringifiedSource("(DEFCONSTANT *NULL-DECODED-DATE-TIME* DECODED-DATE-TIME (NEW DECODED-DATE-TIME :DATE-TIME-MILLIS NULL :DATE-TIME-SECOND NULL :DATE-TIME-MINUTE NULL :DATE-TIME-HOUR NULL :DATE-TIME-DAY NULL :DATE-TIME-MONTH NULL :DATE-TIME-YEAR NULL :DATE-TIME-ZONE NULL :DATE-TIME-DOW NULL))");
        }

      } finally {
        Stella.$CONTEXT$.set(old$Context$000);
        Stella.$MODULE$.set(old$Module$000);
      }
    }
  }

}
