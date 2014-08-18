

/* First created by JCasGen Sat Aug 16 16:05:42 IDT 2014 */
package ac.biu.nlp.nlp.ie.onthefly.input.uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Aug 18 12:56:04 IDT 2014
 * XML source: C:/Java/Git/breep/ace_events/src/main/resources/desc/OdieInputTypes.xml
 * @generated */
public class Treeout extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Treeout.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Treeout() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Treeout(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Treeout(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Treeout(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated */
  public String getValue() {
    if (Treeout_Type.featOkTst && ((Treeout_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "ac.biu.nlp.nlp.ie.onthefly.input.uima.Treeout");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Treeout_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated */
  public void setValue(String v) {
    if (Treeout_Type.featOkTst && ((Treeout_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "ac.biu.nlp.nlp.ie.onthefly.input.uima.Treeout");
    jcasType.ll_cas.ll_setStringValue(addr, ((Treeout_Type)jcasType).casFeatCode_value, v);}    
  }

    