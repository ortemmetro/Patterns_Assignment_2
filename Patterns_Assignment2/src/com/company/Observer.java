package com.company;

import java.util.List;

public interface Observer {
    void update(List<String> iphoneVersion, List<String> iphoneAmount, List<String> price);
}
