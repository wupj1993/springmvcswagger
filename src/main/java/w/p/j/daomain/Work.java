/*
 * Copyright (c) 2015 - 7 - 21
 * -0 :47:32
 * -一个人的时候你要好好的努力，这样以后配得起相遇那一刻的怦然心动，你若盛开，清风自来。
 * -作者:吴培基
 * -QQ:757671834
 */

package w.p.j.daomain;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/21.12:47
 * ****************************************************
 */
public class Work {
    private String workName;
    private int workId;

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
    }

    public Work(String workName, int workId) {
        this.workName = workName;
        this.workId = workId;
    }
}
