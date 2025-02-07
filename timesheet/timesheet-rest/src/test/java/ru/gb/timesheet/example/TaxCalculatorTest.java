package ru.gb.timesheet.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

//@ExtendWith(MockitoExtension.class)
class TaxCalculatorTest {

//    @Mock
//    TaxResolver mock;

    @Test
    void testGetPriceWithTax() {
        TaxResolver mock = Mockito.mock(TaxResolver.class); //--
//        when(mock.getCurrentTax()).thenReturn(0.2); // не применим для void методов
        doReturn(0.2).when(mock).getCurrentTax();
        TaxCalculator taxCalculator = new TaxCalculator(mock);
        Assertions.assertEquals(120.0, taxCalculator.getPriceWithTax(100.0));

//        verify(mock).getCurrentTax(); // чтобы убедитьс, что метод mock был вызван
    }
}