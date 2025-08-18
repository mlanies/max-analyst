package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class evf implements yxf {
    public static final evf X;
    public static final evf Y;
    public static final evf Z;
    public static final evf o;
    public static final evf s0;
    public static final /* synthetic */ evf[] t0;
    public static final /* synthetic */ v25 u0;
    public final String a;
    public final String b;
    public final Integer c;

    static {
        evf evfVar = new evf("GET_INFO", 0, "WebAppBiometryGetInfo", "biometry_get_info", 8);
        o = evfVar;
        evf evfVar2 = new evf("REQUEST_ACCESS", 1, "WebAppBiometryRequestAccess", "biometry_request_access", 9);
        X = evfVar2;
        evf evfVar3 = new evf("UPDATE_TOKEN", 2, "WebAppBiometryUpdateToken", "biometry_update_token", 10);
        Y = evfVar3;
        evf evfVar4 = new evf("REQUEST_AUTH", 3, "WebAppBiometryRequestAuth", "biometry_request_auth", 11);
        Z = evfVar4;
        evf evfVar5 = new evf("OPEN_SETTINGS", 4, "WebAppBiometryOpenSettings", "biometry_open_settings", 13);
        s0 = evfVar5;
        evf[] evfVarArr = {evfVar, evfVar2, evfVar3, evfVar4, evfVar5};
        t0 = evfVarArr;
        u0 = new v25(evfVarArr);
    }

    public evf(String str, int i, String str2, String str3, Integer num) {
        this.a = str2;
        this.b = str3;
        this.c = num;
    }

    public static evf valueOf(String str) {
        return (evf) Enum.valueOf(evf.class, str);
    }

    public static evf[] values() {
        return (evf[]) t0.clone();
    }

    @Override // defpackage.yxf
    public final Integer a() {
        return this.c;
    }

    @Override // defpackage.yxf
    public final String b() {
        return this.a;
    }

    @Override // defpackage.yxf
    public final String c() {
        return this.b;
    }
}
