/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.arquillian.example;

/**
 *
 * @author srishtimehra
 */
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import javax.inject.Inject;


@RunWith(Arquillian.class)
public class CalculatorTest {

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
            .addClasses(CalculatorClient.class)
            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Inject
    CalculatorClient calculate;

    @Test
    public void should_ask_operation_operands() {
        Assert.assertEquals("Enter the operation you want the application to perform and the numbers you want to perform the operation on (separated by ,)",
            calculate.userOperation());
        Assert.assertEquals("You can enter: sum, difference, multiply or divide. Please type the operation name.", 
            calculate.instruction());
    }
}