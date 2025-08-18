package ru.ok.android.externcalls.sdk;

import defpackage.re3;
import defpackage.se3;

/* loaded from: classes2.dex */
public class SimpleConfigurationStore implements se3 {
    private final String appKey;
    private final String baseEndpoint;
    private re3 sessionInfo;

    public SimpleConfigurationStore(se3 se3Var) {
        this.appKey = se3Var.getAppKey();
        this.baseEndpoint = se3Var.getBaseEndpoint();
    }

    @Override // defpackage.se3
    public String getAppKey() {
        return this.appKey;
    }

    @Override // defpackage.se3
    public String getBaseEndpoint() {
        return this.baseEndpoint;
    }

    @Override // defpackage.se3
    public re3 getSessionInfo() {
        return this.sessionInfo;
    }

    @Override // defpackage.se3
    public void setSessionInfo(re3 re3Var) {
        this.sessionInfo = re3Var;
    }
}
