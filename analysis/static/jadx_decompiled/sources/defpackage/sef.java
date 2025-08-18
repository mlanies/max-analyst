package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
public final /* synthetic */ class sef implements qj3, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lef b;

    public /* synthetic */ sef(lef lefVar, int i) {
        this.a = i;
        this.b = lefVar;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        Locale locale = Locale.ENGLISH;
        hm9.p("wef", "removeFromRepository: failed conversionData = " + this.b, (Throwable) obj);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 1:
                qef qefVar = (qef) obj;
                lef lefVar = this.b;
                String str = lefVar.a;
                ref refVar = lefVar.b;
                mqb mqbVar = refVar.a;
                qefVar.getClass();
                xlc xlcVarA = xlc.a(5, "SELECT * FROM video_conversions WHERE source_uri=? AND quality=? AND start_trim_position=? AND end_trim_position=? AND mute=?");
                if (str == null) {
                    xlcVarA.W(1);
                } else {
                    xlcVarA.f(1, str);
                }
                xlcVarA.j(2, mqbVar.b);
                xlcVarA.h(3, refVar.b);
                xlcVarA.h(4, refVar.c);
                xlcVarA.j(5, refVar.d ? 1L : 0L);
                return new t28(new oef(qefVar, 1, xlcVarA));
            default:
                qef qefVar2 = (qef) obj;
                lef lefVar2 = this.b;
                String str2 = lefVar2.a;
                ref refVar2 = lefVar2.b;
                mqb mqbVar2 = refVar2.a;
                qefVar2.getClass();
                return new sa3(2, new pef(qefVar2, str2, mqbVar2, refVar2.b, refVar2.c, refVar2.d));
        }
    }
}
