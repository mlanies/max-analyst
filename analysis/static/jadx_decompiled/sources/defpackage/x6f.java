package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import one.me.sdk.transfer.domain.UploadException;

/* loaded from: classes2.dex */
public final /* synthetic */ class x6f implements b66, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7f b;

    public /* synthetic */ x6f(c7f c7fVar, int i) {
        this.a = i;
        this.b = c7fVar;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                this.b.b((v6f) obj);
                return;
            case 5:
                v6f v6fVar = (v6f) obj;
                c7f c7fVar = this.b;
                c7fVar.getClass();
                if (v6fVar.a()) {
                    d7f d7fVar = v6fVar.a;
                    int i = d7fVar.c;
                    if (i == 6 || h4f.a(i)) {
                        c7fVar.d(d7fVar);
                        return;
                    } else {
                        c7fVar.b(v6fVar);
                        return;
                    }
                }
                return;
            default:
                c7f c7fVar2 = this.b;
                zl4 zl4Var = (zl4) obj;
                synchronized (c7fVar2) {
                    c7fVar2.i.a(zl4Var);
                }
                return;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) throws Throwable {
        dle gs9Var;
        int i;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        final c7f c7fVar = this.b;
        int i5 = 2;
        final int i6 = 1;
        final int i7 = 0;
        switch (this.a) {
            case 0:
                v6f v6fVar = (v6f) obj;
                c7fVar.getClass();
                hm9.m("c7f", "prepareUploadFiles: started for upload=%s", v6fVar);
                if (!oag.t(v6fVar.b)) {
                    return iqd.g(v6fVar);
                }
                it3 it3VarC = ((cj0) ((af8) c7fVar.g.g.getValue())).c(v6fVar.a.a);
                if (it3VarC == null) {
                    return iqd.f(new UploadException("failed to prepare upload files"));
                }
                long j = it3VarC.b;
                if (j == 0) {
                    return iqd.f(new UploadException("content is zero length"));
                }
                String str = it3VarC.e;
                if (oag.t(str)) {
                    hm9.m("c7f", "prepareUploadFiles: need copy for upload=%s", v6fVar);
                    q1a q1aVar = new q1a(1, new u00(c7fVar, v6fVar, it3VarC, 29));
                    ztc ztcVar = c7fVar.f;
                    return q1aVar.m(ztcVar).i(ztcVar);
                }
                u6f u6fVarB = v6fVar.b();
                u6fVarB.c = it3VarC.c;
                u6fVarB.b = str;
                u6fVarB.f = j;
                return iqd.g(new v6f(u6fVarB));
            case 1:
                final v6f v6fVar2 = (v6f) obj;
                c7fVar.getClass();
                ztc ztcVarB = muc.b();
                int i8 = v6fVar2.a.c;
                boolean z = i8 == 3;
                ztc ztcVar2 = c7fVar.f;
                return (z || h4f.a(i8)) ? new q1a(2, new Callable() { // from class: z6f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        v6f v6fVar3 = v6fVar2;
                        c7f c7fVar2 = c7fVar;
                        int i9 = i6;
                        c7fVar2.getClass();
                        switch (i9) {
                            case 0:
                                u6f u6fVarB2 = v6fVar3.b();
                                String absolutePath = v6fVar3.b;
                                w0f w0fVar = c7fVar2.g;
                                try {
                                    hm9.m("c7f", "resizeSticker: path = %s", absolutePath);
                                    File fileA = ((zi5) w0fVar.f.getValue()).a("png");
                                    if (w0fVar.f(absolutePath, fileA.getAbsolutePath())) {
                                        hm9.m("c7f", "resizeSticker: resized for path = %s", absolutePath);
                                        absolutePath = fileA.getAbsolutePath();
                                    } else {
                                        hm9.m("c7f", "resizeSticker: no resize needed for path = %s", absolutePath);
                                    }
                                } catch (IOException e) {
                                    hm9.p("c7f", "resizeSticker: failed", e);
                                }
                                u6fVarB2.b = absolutePath;
                                return new v6f(u6fVarB2);
                            default:
                                u6f u6fVarB3 = v6fVar3.b();
                                String absolutePath2 = v6fVar3.b;
                                w0f w0fVar2 = c7fVar2.g;
                                try {
                                    hm9.m("c7f", "resizePhoto: path = %s", absolutePath2);
                                    File fileA2 = ((zi5) w0fVar2.f.getValue()).a("jpg");
                                    if (j47.c0(((cj0) ((af8) w0fVar2.g.getValue())).c, absolutePath2, fileA2.getAbsolutePath())) {
                                        hm9.m("c7f", "resizePhoto: resized for path = %s", absolutePath2);
                                        absolutePath2 = fileA2.getAbsolutePath();
                                    } else {
                                        hm9.m("c7f", "resizePhoto: no resize needed for path = %s", absolutePath2);
                                    }
                                } catch (IOException e2) {
                                    hm9.p("c7f", "resizePhoto: failed", e2);
                                }
                                u6fVarB3.b = absolutePath2;
                                return new v6f(u6fVarB3);
                        }
                    }
                }).m(ztcVarB).i(ztcVar2) : h4f.b(i8) ? new q1a(2, new Callable() { // from class: z6f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        v6f v6fVar3 = v6fVar2;
                        c7f c7fVar2 = c7fVar;
                        int i9 = i7;
                        c7fVar2.getClass();
                        switch (i9) {
                            case 0:
                                u6f u6fVarB2 = v6fVar3.b();
                                String absolutePath = v6fVar3.b;
                                w0f w0fVar = c7fVar2.g;
                                try {
                                    hm9.m("c7f", "resizeSticker: path = %s", absolutePath);
                                    File fileA = ((zi5) w0fVar.f.getValue()).a("png");
                                    if (w0fVar.f(absolutePath, fileA.getAbsolutePath())) {
                                        hm9.m("c7f", "resizeSticker: resized for path = %s", absolutePath);
                                        absolutePath = fileA.getAbsolutePath();
                                    } else {
                                        hm9.m("c7f", "resizeSticker: no resize needed for path = %s", absolutePath);
                                    }
                                } catch (IOException e) {
                                    hm9.p("c7f", "resizeSticker: failed", e);
                                }
                                u6fVarB2.b = absolutePath;
                                return new v6f(u6fVarB2);
                            default:
                                u6f u6fVarB3 = v6fVar3.b();
                                String absolutePath2 = v6fVar3.b;
                                w0f w0fVar2 = c7fVar2.g;
                                try {
                                    hm9.m("c7f", "resizePhoto: path = %s", absolutePath2);
                                    File fileA2 = ((zi5) w0fVar2.f.getValue()).a("jpg");
                                    if (j47.c0(((cj0) ((af8) w0fVar2.g.getValue())).c, absolutePath2, fileA2.getAbsolutePath())) {
                                        hm9.m("c7f", "resizePhoto: resized for path = %s", absolutePath2);
                                        absolutePath2 = fileA2.getAbsolutePath();
                                    } else {
                                        hm9.m("c7f", "resizePhoto: no resize needed for path = %s", absolutePath2);
                                    }
                                } catch (IOException e2) {
                                    hm9.p("c7f", "resizePhoto: failed", e2);
                                }
                                u6fVarB3.b = absolutePath2;
                                return new v6f(u6fVarB3);
                        }
                    }
                }).m(ztcVarB).i(ztcVar2) : iqd.g(v6fVar2);
            case 2:
            case 5:
            default:
                return c7fVar.e((d7f) obj);
            case 3:
                v6f v6fVar3 = (v6f) obj;
                c7fVar.getClass();
                if (!oag.t(v6fVar3.d)) {
                    hm9.n("c7f", "requestUrlSingle: already have upload url" + v6fVar3);
                    return iqd.g(v6fVar3);
                }
                hm9.n("c7f", "requestUrlSingle: request upload url" + v6fVar3);
                int i9 = v6fVar3.a.c;
                switch (au1.s(i9)) {
                    case 1:
                        gs9Var = new gs9(1, 1);
                        break;
                    case 2:
                    case 6:
                        gs9Var = new gs9(Boolean.FALSE);
                        break;
                    case 3:
                        gs9Var = new gs9(Boolean.TRUE);
                        break;
                    case 4:
                        gs9Var = new tq2();
                        break;
                    case 5:
                        gs9Var = new gs9(3, 1);
                        break;
                    case 7:
                        gs9Var = new gs9((sla) null, 11);
                        break;
                    case 8:
                        gs9Var = new gs9(2, 1);
                        break;
                    default:
                        throw new UploadException("tamRequestFromUploadType, can't request url for unknown media type= ".concat(h4f.t(i9)));
                }
                uqd uqdVarH = ((k4a) c7fVar.e).K(gs9Var, c7fVar.f).h(new a7f(v6fVar3, 1));
                fme fmeVar = c7fVar.c;
                fmeVar.getClass();
                return uqdVarH.j(new dme(fmeVar, 1, 0));
            case 4:
                v6f v6fVar4 = (v6f) obj;
                c7fVar.getClass();
                hm9.m("c7f", "uploadFileObservable: upload=%s", v6fVar4);
                int i10 = v6fVar4.a.c;
                String str2 = (i10 == 5 || h4f.b(i10)) ? v6fVar4.c : null;
                switch (au1.s(i10)) {
                    case 1:
                    case 8:
                        i = 3;
                        break;
                    case 2:
                    case 3:
                    case 6:
                        i = 1;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 2;
                        break;
                    case 7:
                        i = 5;
                        break;
                    default:
                        throw new UploadException("unknown http type for upload type ".concat(h4f.t(i10)));
                }
                ime imeVar = c7fVar.b;
                imeVar.getClass();
                je7 je7Var = imeVar.a;
                String str3 = v6fVar4.b;
                String str4 = v6fVar4.d;
                ztc ztcVar3 = c7fVar.f;
                ty9 ty9Var = new ty9(new oz9(new e0a(new uq6(je7Var, i, str3, str2, str4, ztcVar3).r(ztcVar3), new ui0(c7fVar, i10, v6fVar4, 14), 3), ft.e, new ypc(c7fVar, 13, v6fVar4), ft.d), new vg4(new AtomicLong(), TimeUnit.MILLISECONDS, 500L, new n2f(7)), 1);
                ((t33) c7fVar.d).getClass();
                return new e0a(new e0a(ty9Var, new pc5(TimeUnit.DAYS.toMillis(7L), v6fVar4.i, 3), 4), new bqc(26, c7fVar.c), 6);
            case 6:
                d7f d7fVar = (d7f) obj;
                f28 f28VarD = c7fVar.a.d(d7fVar);
                n2f n2fVar = new n2f(5);
                kj6 kj6Var = ft.e;
                r66 r66Var = ft.d;
                return new c38(new e38(new e38(new e38(f28VarD, n2fVar, kj6Var, r66Var), kj6Var, new n2f(6), r66Var), kj6Var, kj6Var, new y6f(d7fVar, 0)));
            case 7:
                v6f v6fVar5 = (v6f) obj;
                c7fVar.getClass();
                return v6fVar5.a() ? qy9.m(v6fVar5) : new oz9(new q28(new rqd(new uqd(new rqd(new uqd(new uqd(iqd.g(v6fVar5).m(c7fVar.f), new x6f(c7fVar, i7), 0), new x6f(c7fVar, i6), 0), new x6f(c7fVar, i5), 2), new x6f(c7fVar, i4), 0), new x6f(c7fVar, i5), 2), new x6f(c7fVar, i3), 3), new x6f(c7fVar, i2), ft.e, ft.d);
        }
    }
}
