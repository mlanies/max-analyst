package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class v1g implements yxf {
    public static final v1g X;
    public static final v1g Y;
    public static final v1g Z;
    public static final v1g o;
    public static final v1g s0;
    public static final v1g t0;
    public static final /* synthetic */ v1g[] u0;
    public static final /* synthetic */ v25 v0;
    public final String a;
    public final String b;
    public final Integer c;

    static {
        v1g v1gVar = new v1g("SECURE_SAVE_KEY", 0, "WebAppSecureStorageSaveKey", "secure_storage_save_key", 1);
        o = v1gVar;
        v1g v1gVar2 = new v1g("SECURE_GET_KEY", 1, "WebAppSecureStorageGetKey", "secure_storage_get_key", 2);
        X = v1gVar2;
        v1g v1gVar3 = new v1g("SECURE_CLEAR_KEYS", 2, "WebAppSecureStorageClear", "secure_storage_clear", 4);
        Y = v1gVar3;
        v1g v1gVar4 = new v1g("SAVE_KEY", 3, "WebAppDeviceStorageSaveKey", "device_storage_save_key", 5);
        Z = v1gVar4;
        v1g v1gVar5 = new v1g("GET_KEY", 4, "WebAppDeviceStorageGetKey", "device_storage_get_key", 6);
        s0 = v1gVar5;
        v1g v1gVar6 = new v1g("CLEAR_KEYS", 5, "WebAppDeviceStorageClear", "device_storage_clear", 7);
        t0 = v1gVar6;
        v1g[] v1gVarArr = {v1gVar, v1gVar2, v1gVar3, v1gVar4, v1gVar5, v1gVar6};
        u0 = v1gVarArr;
        v0 = new v25(v1gVarArr);
    }

    public v1g(String str, int i, String str2, String str3, Integer num) {
        this.a = str2;
        this.b = str3;
        this.c = num;
    }

    public static v1g valueOf(String str) {
        return (v1g) Enum.valueOf(v1g.class, str);
    }

    public static v1g[] values() {
        return (v1g[]) u0.clone();
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
