package de.fhg.iais.roberta.syntax.action.nao;

import org.junit.Assert;
import org.junit.Test;

import de.fhg.iais.roberta.util.test.nao.Helper;

public class TakePictureTopTestMissingValue {
    Helper h = new Helper();

    @Test
    public void make_ByDefault_ReturnInstanceOfTakePictureClass() throws Exception {
        String expectedResult = "BlockAST [project=[[Location [x=138, y=138], " + "MainTask [], " + "TakePicture [TOP, EmptyExpr [defVal=NUMBER_INT]]]]]";
        
        String result = this.h.generateTransformerString("/action/takePicture_top_missingValue.xml");

        Assert.assertEquals(expectedResult, result);
    }
    
    /*
    @Test
    public void astToBlock_XMLtoJAXBtoASTtoXML_ReturnsSameXML() throws Exception {

        this.h.assertTransformationIsOk("/action/takePicture_top_missingValue.xml");
    }*/
}