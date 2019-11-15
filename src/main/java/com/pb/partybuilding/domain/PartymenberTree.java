package com.pb.partybuilding.domain;

import java.util.List;

public class PartymenberTree {

    public String id;

    public String pId;

    public String name;

    public String nodes;

    public String open;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNodes() {
        return nodes;
    }

    public void setNodes(String nodes) {
        this.nodes = nodes;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public PartymenberTree(String id, String pId, String name, String nodes, String open) {
        this.id = id;
        this.pId = pId;
        this.name = name;
        this.nodes = nodes;
        this.open = open;
    }

    public PartymenberTree() {
    }
}
