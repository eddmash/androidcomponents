.. java:import:: android.util Log

.. java:import:: android.widget EditText

.. java:import:: android.widget Spinner

LTECheck
========

.. java:package:: com.eddmash.validation.checks
   :noindex:

.. java:type:: public class LTECheck extends NotEmptyCheck

   Check if the value on the view is less than or equal the provided value.

Constructors
------------
LTECheck
^^^^^^^^

.. java:constructor:: public LTECheck(EditText view, String errorMessage, int min)
   :outertype: LTECheck

LTECheck
^^^^^^^^

.. java:constructor:: public LTECheck(Spinner view, String errorMessage, int min)
   :outertype: LTECheck

LTECheck
^^^^^^^^

.. java:constructor:: public LTECheck(EditText view, String errorMessage, double min)
   :outertype: LTECheck

LTECheck
^^^^^^^^

.. java:constructor:: public LTECheck(Spinner view, String errorMessage, double min)
   :outertype: LTECheck

Methods
-------
run
^^^

.. java:method:: @Override public boolean run()
   :outertype: LTECheck

