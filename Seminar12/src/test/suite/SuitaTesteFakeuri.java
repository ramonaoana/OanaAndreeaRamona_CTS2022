package test.suite;

import agentie.PachetTuristic;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.categorii.Boundary;
import test.categorii.UtilizareFake;
import test.dubluri.PachetFake;
import test.teste.AgentieTestCase;
import test.teste.PachetTuristicTest;

@RunWith(Categories.class)
//@RunWith(Suite.class) // ruleaza toate testele
@Suite.SuiteClasses({AgentieTestCase.class, PachetTuristicTest.class})
@Categories.IncludeCategory(UtilizareFake.class)
@Categories.ExcludeCategory(Boundary.class)
public class SuitaTesteFakeuri {

}
