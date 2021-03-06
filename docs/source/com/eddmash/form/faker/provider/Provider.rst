.. java:import:: com.eddmash.form.faker Callback

.. java:import:: com.eddmash.form.faker FakerException

.. java:import:: com.eddmash.form.faker PopulatorInterface

.. java:import:: org.apache.commons.math3.random RandomDataGenerator

.. java:import:: java.util ArrayList

.. java:import:: java.util Collections

.. java:import:: java.util List

Provider
========

.. java:package:: com.eddmash.form.faker.provider
   :noindex:

.. java:type:: public abstract class Provider implements ProviderInterface

   An implimentation of \ :java:ref:`ProviderInterface`\ .

   Go to \ :java:ref:`ProviderInterface`\  to learn more.

Fields
------
PATTERN
^^^^^^^

.. java:field:: public static final String PATTERN
   :outertype: Provider

RANDOM_INT
^^^^^^^^^^

.. java:field:: public static final String RANDOM_INT
   :outertype: Provider

SEPARATOR
^^^^^^^^^

.. java:field:: public static final String SEPARATOR
   :outertype: Provider

format
^^^^^^

.. java:field:: protected String format
   :outertype: Provider

populator
^^^^^^^^^

.. java:field:: protected PopulatorInterface populator
   :outertype: Provider

Constructors
------------
Provider
^^^^^^^^

.. java:constructor:: public Provider(PopulatorInterface populator)
   :outertype: Provider

Provider
^^^^^^^^

.. java:constructor:: public Provider(PopulatorInterface populator, String format)
   :outertype: Provider

Methods
-------
getData
^^^^^^^

.. java:method:: @Override public String getData()
   :outertype: Provider

getPersonName
^^^^^^^^^^^^^

.. java:method:: public String getPersonName()
   :outertype: Provider

getPopulator
^^^^^^^^^^^^

.. java:method:: public PopulatorInterface getPopulator()
   :outertype: Provider

mergeArrays
^^^^^^^^^^^

.. java:method:: protected String[] mergeArrays(String[] first, String[] second)
   :outertype: Provider

parseFormat
^^^^^^^^^^^

.. java:method:: protected String parseFormat(String format, Callback callback)
   :outertype: Provider

randomDouble
^^^^^^^^^^^^

.. java:method:: protected Double randomDouble()
   :outertype: Provider

randomDouble
^^^^^^^^^^^^

.. java:method:: protected Double randomDouble(int minNumber, int maxNumber)
   :outertype: Provider

randomElement
^^^^^^^^^^^^^

.. java:method:: protected String randomElement(String[] strings) throws FakerException
   :outertype: Provider

randomElement
^^^^^^^^^^^^^

.. java:method:: protected String randomElement(String[] strings, int count) throws FakerException
   :outertype: Provider

randomElements
^^^^^^^^^^^^^^

.. java:method:: protected String[] randomElements(String[] strings) throws FakerException
   :outertype: Provider

randomElements
^^^^^^^^^^^^^^

.. java:method:: protected String[] randomElements(String[] strings, int count) throws FakerException
   :outertype: Provider

randomInt
^^^^^^^^^

.. java:method:: protected Integer randomInt()
   :outertype: Provider

randomInt
^^^^^^^^^

.. java:method:: protected Integer randomInt(int minNumber, int maxNumber)
   :outertype: Provider

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: Provider

