package defpackage;

import androidx.work.WorkRequest;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class t8g extends rd7 implements k56 {
    public final /* synthetic */ WorkRequest a;
    public final /* synthetic */ s7g b;
    public final /* synthetic */ String c;
    public final /* synthetic */ imc o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8g(WorkRequest workRequest, s7g s7gVar, String str, imc imcVar) {
        super(0);
        this.a = workRequest;
        this.b = s7gVar;
        this.c = str;
        this.o = imcVar;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        List listSingletonList = Collections.singletonList(this.a);
        new h25(new g7g(this.b, this.c, h65.b, listSingletonList), this.o).run();
        return e5f.a;
    }
}
