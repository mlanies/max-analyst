package defpackage;

/* loaded from: classes2.dex */
public enum zs1 implements at1 {
    CHAT_HEAD("CHAT_HEAD"),
    PROFILE("PROFILE"),
    ATTACH("ATTACH"),
    HISTORY("HISTORY"),
    CALL_CONTACT("CALL_CONTACT"),
    CONTACT("CONTACT"),
    RECALL("RECALL");

    public final String a;

    zs1(String str) {
        this.a = str;
    }

    @Override // defpackage.at1
    public final String a() {
        return this.a;
    }
}
