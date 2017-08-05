package com.bookua.autotest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Gagauz Sergey
 * Created by user on 06.08.2017.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({RegistrationTests.class, LinksClickTests.class})
public class TestSuite {
}
