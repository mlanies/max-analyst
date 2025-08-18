package defpackage;

/* loaded from: classes2.dex */
public final class no4 {
    public final je7 a;
    public final String b = no4.class.getName();

    public no4(je7 je7Var) {
        this.a = je7Var;
    }

    public final void a(long j, long j2, String str, String str2, String str3) {
        one oneVar = new one();
        oneVar.a = j;
        oneVar.b = str;
        oneVar.j = j2;
        oneVar.k = str2;
        oneVar.g = str3;
        oneVar.h = true;
        pne pneVar = new pne(oneVar);
        hm9.m(this.b, "fileAttachDownloader.downloadAttach(%s)", pneVar);
        ((rf5) this.a.getValue()).a(pneVar);
    }
}
