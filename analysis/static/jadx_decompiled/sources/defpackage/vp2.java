package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vp2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ e52 Z;
    public final /* synthetic */ rq2 s0;
    public final /* synthetic */ Long t0;
    public final /* synthetic */ zy8 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp2(String str, e52 e52Var, rq2 rq2Var, Long l, zy8 zy8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = e52Var;
        this.s0 = rq2Var;
        this.t0 = l;
        this.u0 = zy8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vp2(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        String str;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            e52 e52Var = this.Z;
            Pattern pattern = e52Var.M() ? bre.c : bre.e;
            Pattern pattern2 = ura.a;
            String strReplace = this.Y;
            Matcher matcher = pattern.matcher(strReplace);
            loop0: while (true) {
                str = strReplace;
                while (matcher.find()) {
                    Matcher matcher2 = pattern2.matcher(str);
                    boolean z = false;
                    while (matcher2.find() && matcher2.start() <= matcher.end()) {
                        if (matcher2.group().contains(matcher.group())) {
                            z = true;
                        }
                    }
                    if (!z && matcher.group().contains("/\ufeff")) {
                        break;
                    }
                }
                strReplace = str.replace(matcher.group(), matcher.group().replace("/\ufeff", String.valueOf('/')));
            }
            o89 o89Var = this.s0.u0;
            zy8 zy8Var = this.u0;
            cz5 cz5VarA = zy8Var != null ? zy8Var.a() : null;
            this.X = 1;
            if (o89.b(o89Var, e52Var.a, str, this.t0, cz5VarA, this, 16) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
