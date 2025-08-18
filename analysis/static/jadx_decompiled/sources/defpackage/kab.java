package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class kab {
    public final khe A;
    public final khe B;
    public final khe C;
    public final ContentResolver a;
    public final gab b;
    public final mr0 c;
    public final boolean d;
    public final aab e;
    public final bp4 f;
    public final boolean g;
    public final zv6 h;
    public final Set i;
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();
    public final khe l;
    public final khe m;
    public final khe n;
    public final khe o;
    public final khe p;
    public final khe q;
    public final khe r;
    public final khe s;
    public final khe t;
    public final khe u;
    public final khe v;
    public final khe w;
    public final khe x;
    public final khe y;
    public final khe z;

    public kab(ContentResolver contentResolver, gab gabVar, mr0 mr0Var, boolean z, aab aabVar, bp4 bp4Var, boolean z2, zv6 zv6Var, Set set) {
        this.a = contentResolver;
        this.b = gabVar;
        this.c = mr0Var;
        this.d = z;
        this.e = aabVar;
        this.f = bp4Var;
        this.g = z2;
        this.h = zv6Var;
        this.i = set;
        new LinkedHashMap();
        final int i = 0;
        this.l = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i2 = 17;
        this.m = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i2) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i3 = 1;
        this.n = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i3) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i4 = 2;
        this.o = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i4) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i5 = 3;
        this.p = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i5) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i6 = 4;
        this.q = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i6) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i7 = 5;
        this.r = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i7) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i8 = 6;
        this.s = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i8) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i9 = 7;
        this.t = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i9) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i10 = 8;
        this.u = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i10) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i11 = 9;
        this.v = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i11) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i12 = 10;
        this.w = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i12) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i13 = 11;
        this.x = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i13) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i14 = 12;
        this.y = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i14) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i15 = 13;
        this.z = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i15) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i16 = 14;
        this.A = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i16) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i17 = 15;
        this.B = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i17) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
        final int i18 = 16;
        this.C = new khe(new k56(this) { // from class: jab
            public final /* synthetic */ kab b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                kab kabVar = this.b;
                switch (i18) {
                    case 0:
                        f46.I();
                        return new r9((dab) kabVar.p.getValue(), 1);
                    case 1:
                        f46.I();
                        return new r9((dab) kabVar.u.getValue(), 1);
                    case 2:
                        f46.I();
                        return kabVar.h((dab) kabVar.r.getValue());
                    case 3:
                        f46.I();
                        aab aabVar2 = kabVar.e;
                        dab dabVar = (dab) kabVar.r.getValue();
                        kabVar.b.getClass();
                        return new sse(dabVar, aabVar2, 0);
                    case 4:
                        f46.I();
                        gab gabVar2 = kabVar.b;
                        dab dabVar2 = (dab) kabVar.p.getValue();
                        gabVar2.getClass();
                        return new r9(dabVar2, 2);
                    case 5:
                        f46.I();
                        return kabVar.j(kabVar.c);
                    case 6:
                        f46.I();
                        gab gabVar3 = kabVar.b;
                        dab dabVar3 = (dab) kabVar.t.getValue();
                        gabVar3.getClass();
                        return new r9(dabVar3, 2);
                    case 7:
                        f46.I();
                        aab aabVar3 = kabVar.e;
                        gab gabVar4 = kabVar.b;
                        return new sse(kabVar.k(new j24(gabVar4.j.h(), gabVar4.k, 1)), aabVar3, 0);
                    case 8:
                        f46.I();
                        aab aabVar4 = kabVar.e;
                        gab gabVar5 = kabVar.b;
                        return new sse(kabVar.k(new zo7(gabVar5.j.h(), gabVar5.k, gabVar5.a, 0)), aabVar4, 0);
                    case 9:
                        gab gabVar6 = kabVar.b;
                        j24 j24Var = new j24(gabVar6.j.h(), gabVar6.k, 1);
                        gab gabVar7 = kabVar.b;
                        return kabVar.i(j24Var, new nte[]{new gp7(gabVar7.j.j(), gabVar7.k, gabVar7.a)});
                    case 10:
                        gab gabVar8 = kabVar.b;
                        return kabVar.g(new tq7(gabVar8.j.h(), gabVar8.a, 1));
                    case 11:
                        gab gabVar9 = kabVar.b;
                        ExecutorService executorServiceH = gabVar9.j.h();
                        ContentResolver contentResolver2 = gabVar9.a;
                        y7g y7gVar = gabVar9.k;
                        zo7 zo7Var = new zo7(executorServiceH, y7gVar, contentResolver2, 0);
                        o55 o55Var = gabVar9.j;
                        return kabVar.i(zo7Var, new nte[]{new ap7(o55Var.h(), y7gVar, gabVar9.a), new gp7(o55Var.j(), y7gVar, gabVar9.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        gab gabVar10 = kabVar.b;
                        return kabVar.g(new tq7(gabVar10.j.d(), gabVar10.a, 0));
                    case 13:
                        gab gabVar11 = kabVar.b;
                        zo7 zo7Var2 = new zo7(gabVar11.j.h(), gabVar11.k, gabVar11.a, 1);
                        gab gabVar12 = kabVar.b;
                        return kabVar.i(zo7Var2, new nte[]{new gp7(gabVar12.j.j(), gabVar12.k, gabVar12.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        gab gabVar13 = kabVar.b;
                        so7 so7Var = new so7(gabVar13.j.h(), gabVar13.k, gabVar13.b, 1);
                        gab gabVar14 = kabVar.b;
                        return kabVar.i(so7Var, new nte[]{new gp7(gabVar14.j.j(), gabVar14.k, gabVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        gab gabVar15 = kabVar.b;
                        so7 so7Var2 = new so7(gabVar15.j.h(), gabVar15.k, gabVar15.c, 0);
                        gab gabVar16 = kabVar.b;
                        return kabVar.i(so7Var2, new nte[]{new gp7(gabVar16.j.j(), gabVar16.k, gabVar16.a)});
                    case 16:
                        gab gabVar17 = kabVar.b;
                        gabVar17.getClass();
                        return kabVar.h(gabVar17.b(new r9(new j24(qq1.a, gabVar17.k, 0), 0), true, kabVar.h));
                    default:
                        f46.I();
                        return new r9((dab) kabVar.t.getValue(), 1);
                }
            }
        });
    }

    public final dab a(wv6 wv6Var) {
        f46.I();
        Uri uri = wv6Var.b;
        int i = wv6Var.c;
        if (i == 0) {
            return (dab) this.o.getValue();
        }
        khe kheVar = this.w;
        boolean z = wv6Var.g;
        switch (i) {
            case 2:
                return z ? e() : (dab) kheVar.getValue();
            case 3:
                return z ? e() : (dab) this.v.getValue();
            case 4:
                if (z) {
                    return e();
                }
                String type = this.a.getType(uri);
                Map map = ym8.a;
                return type != null ? eae.o0(type, "video/", false) : false ? (dab) kheVar.getValue() : (dab) this.x.getValue();
            case 5:
                return (dab) this.B.getValue();
            case 6:
                return (dab) this.A.getValue();
            case 7:
                return (dab) this.C.getValue();
            case 8:
                return (dab) this.z.getValue();
            default:
                Set set = this.i;
                if (set != null) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        au1.r(it.next());
                        throw null;
                    }
                }
                throw new IllegalArgumentException(wg0.i("Unsupported uri scheme! Uri is: ", nd2.d(uri)));
        }
    }

    public final dab b(wv6 wv6Var) {
        dab r9Var;
        dab dabVarA = a(wv6Var);
        synchronized (this) {
            r9Var = (dab) this.k.get(dabVarA);
            if (r9Var == null) {
                this.b.getClass();
                r9Var = new r9(dabVarA, 2);
                this.k.put(dabVarA, r9Var);
            }
        }
        return r9Var;
    }

    public final dab c(wv6 wv6Var) {
        nd2.f(wv6Var);
        int i = wv6Var.c;
        if (i == 0) {
            return (dab) this.q.getValue();
        }
        if (i == 2 || i == 3) {
            return (dab) this.s.getValue();
        }
        throw new IllegalArgumentException(wg0.i("Unsupported uri scheme for encoded image fetch! Uri is: ", nd2.d(wv6Var.b)));
    }

    public final dab d(wv6 wv6Var) {
        f46.I();
        int i = wv6Var.c;
        nd2.f(wv6Var);
        if (i == 0) {
            return (dab) this.l.getValue();
        }
        if (i == 2 || i == 3) {
            return (dab) this.m.getValue();
        }
        if (i == 4) {
            return (dab) this.n.getValue();
        }
        Set set = this.i;
        if (set != null) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                au1.r(it.next());
                throw null;
            }
        }
        throw new IllegalArgumentException(wg0.i("Unsupported uri scheme for encoded image fetch! Uri is: ", nd2.d(wv6Var.b)));
    }

    public final dab e() {
        return (dab) this.y.getValue();
    }

    public final synchronized dab f(dab dabVar) {
        dab dabVar2;
        dabVar2 = (dab) this.j.get(dabVar);
        if (dabVar2 == null) {
            gab gabVar = this.b;
            un9 un9Var = new un9(dabVar, gabVar.p, gabVar.j.d());
            gab gabVar2 = this.b;
            fo0 fo0Var = new fo0((y7g) gabVar2.n, gabVar2.o, un9Var, 2);
            this.j.put(dabVar, fo0Var);
            dabVar2 = fo0Var;
        }
        return dabVar2;
    }

    public final dab g(dab dabVar) {
        gab gabVar = this.b;
        lq8 lq8Var = gabVar.n;
        o84 o84Var = gabVar.o;
        return new co0(gabVar.n, o84Var, new sse(new eo0(o84Var, new fo0(lq8Var, o84Var, dabVar, 0)), this.e, 0), 0);
    }

    public final dab h(dab dabVar) {
        boolean zW = f46.W();
        gab gabVar = this.b;
        if (!zW) {
            return g(gabVar.a(dabVar));
        }
        f46.e("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            return g(gabVar.a(dabVar));
        } finally {
            f46.A();
        }
    }

    public final dab i(jp7 jp7Var, nte[] nteVarArr) {
        r9 r9Var = new r9(k(jp7Var), 0);
        gab gabVar = this.b;
        zv6 zv6Var = this.h;
        return h(new sse(gabVar.b(new r9(nteVarArr), true, zv6Var), new ite(gabVar.j.c(), gabVar.b(r9Var, true, zv6Var)), 1));
    }

    public final synchronized iic j(mr0 mr0Var) {
        gab gabVar;
        try {
            f46.I();
            gabVar = this.b;
        } catch (Throwable th) {
            throw th;
        }
        return this.b.b(new r9(k(new un9(gabVar.k, gabVar.d, mr0Var)), 0), this.d && this.f != bp4.c, this.h);
    }

    public final eo0 k(dab dabVar) {
        boolean z = this.g;
        gab gabVar = this.b;
        if (z) {
            f46.I();
            ide ideVar = gabVar.l;
            o84 o84Var = gabVar.o;
            dabVar = new xk4(ideVar, o84Var, new xk4(ideVar, o84Var, dabVar, 1), 0);
        }
        y7g y7gVar = (y7g) gabVar.m;
        o84 o84Var2 = gabVar.o;
        return new eo0(o84Var2, gabVar.s, new fo0(y7gVar, o84Var2, dabVar, 1));
    }
}
