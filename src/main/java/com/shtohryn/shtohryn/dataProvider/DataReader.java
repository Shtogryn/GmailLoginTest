package com.shtohryn.shtohryn.dataProvider;

import java.io.IOException;
import java.util.List;

public interface DataReader<T> {
    List<T[]> read() throws IOException;
}
