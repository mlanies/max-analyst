package ru.ok.onechat.reactions;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import defpackage.a81;
import defpackage.av0;
import defpackage.b7c;
import defpackage.csc;
import defpackage.dvd;
import defpackage.e52;
import defpackage.e7c;
import defpackage.f46;
import defpackage.f7c;
import defpackage.fic;
import defpackage.ft4;
import defpackage.g7c;
import defpackage.gj;
import defpackage.h7c;
import defpackage.hm9;
import defpackage.ir6;
import defpackage.iy2;
import defpackage.j47;
import defpackage.je7;
import defpackage.jz2;
import defpackage.khe;
import defpackage.kld;
import defpackage.kt4;
import defpackage.l6c;
import defpackage.lab;
import defpackage.lld;
import defpackage.m58;
import defpackage.m6d;
import defpackage.od2;
import defpackage.p35;
import defpackage.p94;
import defpackage.ph;
import defpackage.q0e;
import defpackage.qnf;
import defpackage.qyc;
import defpackage.r0e;
import defpackage.re9;
import defpackage.s6c;
import defpackage.t03;
import defpackage.tc2;
import defpackage.uae;
import defpackage.us7;
import defpackage.v5c;
import defpackage.v7c;
import defpackage.w7d;
import defpackage.w9e;
import defpackage.x53;
import defpackage.xp9;
import defpackage.xq9;
import defpackage.y7d;
import defpackage.ys;
import defpackage.z7;
import defpackage.zja;
import defpackage.zn5;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import ru.ok.onechat.reactions.ReactionsViewModel;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ok/onechat/reactions/ReactionsViewModel;", "Lqnf;", "Ltc2;", "event", "Le5f;", "onEvent", "(Ltc2;)V", "Lxp9;", "onNewReactionEvent", "(Lxp9;)V", "Lre9;", "onMessageDeleteEvent", "(Lre9;)V", "g7c", "reactions_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ReactionsViewModel extends qnf {
    public final long b;
    public final iy2 c;
    public final y7d d;
    public final av0 e;
    public final l6c f;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final khe o;
    public final khe q;
    public final fic r;
    public final HashSet s;
    public final khe t;
    public final kld u;
    public final v7c v;
    public final q0e w;
    public final csc g = null;
    public final int x = 1;
    public final khe n = new khe(new b7c(this, 0));
    public final khe p = new khe(new b7c(this, 1));

    public ReactionsViewModel(long j, iy2 iy2Var, y7d y7dVar, av0 av0Var, l6c l6cVar, khe kheVar, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8) {
        int i = 26;
        this.b = j;
        this.c = iy2Var;
        this.d = y7dVar;
        this.e = av0Var;
        this.f = l6cVar;
        this.h = je7Var3;
        this.i = je7Var4;
        this.j = je7Var5;
        this.k = je7Var;
        this.l = je7Var7;
        this.m = je7Var8;
        this.o = new khe(new zja(je7Var6, 11, this));
        new HashMap();
        this.q = new khe(new b7c(this, 2));
        this.r = new fic(new lab(i));
        this.s = new HashSet();
        this.t = new khe(new a81(this, kheVar, je7Var2, 8));
        kld kldVarB = lld.b(0, Integer.MAX_VALUE, 0, 4);
        this.u = kldVarB;
        this.v = new v7c(kldVarB);
        q0e q0eVarA = r0e.a(null);
        this.w = q0eVarA;
        j47.T(f46.R(this), ((p94) je7Var.getValue()).a, null, new e7c(this, null), 2);
        av0Var.d(this);
        t03 t03Var = new t03(q0eVarA, 11);
        int i2 = ft4.o;
        od2.L(od2.F(new zn5(new m58(m6d.O(t03Var, z7.S(300L, kt4.MILLISECONDS)), i), new f7c(this, null), 5), ((p94) je7Var.getValue()).a), f46.R(this));
        final WeakReference weakReference = new WeakReference(this);
        ((qyc) y7dVar).l.add(new w7d() { // from class: c7c
            @Override // defpackage.w7d
            public final void a() {
                fic ficVar;
                ReactionsViewModel reactionsViewModel = (ReactionsViewModel) weakReference.get();
                if (reactionsViewModel == null || (ficVar = reactionsViewModel.r) == null) {
                    return;
                }
                ficVar.reset();
            }
        });
        r0e.a(Boolean.FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x027c, code lost:
    
        if (r0.a(r1, r3) != r2) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(ru.ok.onechat.reactions.ReactionsViewModel r27, defpackage.g7c r28, kotlin.coroutines.Continuation r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.onechat.reactions.ReactionsViewModel.e(ru.ok.onechat.reactions.ReactionsViewModel, g7c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Drawable g(v5c v5cVar) {
        dvd dvdVar;
        Spanned spanned;
        CharSequence charSequence = v5cVar.a;
        int length = charSequence.length();
        try {
            spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        } catch (Throwable unused) {
        }
        Object[] spans = spanned != null ? spanned.getSpans(0, length, dvd.class) : null;
        dvd[] dvdVarArr = (dvd[]) spans;
        if (dvdVarArr == null || (dvdVar = (dvd) ys.e0(dvdVarArr)) == null) {
            return null;
        }
        return dvdVar.b();
    }

    @Override // defpackage.qnf
    public final void d() {
        hm9.n("ru.ok.onechat.reactions.ReactionsViewModel", "onCleared");
        try {
            this.e.f(this);
        } catch (Throwable unused) {
        }
        f();
    }

    public final void f() {
        hm9.n("ru.ok.onechat.reactions.ReactionsViewModel", "cancelChatSubscribeNotifObserving");
        j47.T(f46.R(this), xq9.a.plus(((p94) this.k.getValue()).a), null, new h7c(this, null), 2);
    }

    public final boolean h() {
        return ((Boolean) this.p.getValue()).booleanValue();
    }

    public final e52 i() {
        return (e52) ((jz2) this.c).m(this.b).a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kl7 j(defpackage.ix8 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.onechat.reactions.ReactionsViewModel.j(ix8, boolean):kl7");
    }

    public final boolean k() {
        e52 e52VarI;
        if (h() && (e52VarI = i()) != null) {
            return ((!e52VarI.C() && !e52VarI.R()) || e52VarI.F() || e52VarI.Q()) ? false : true;
        }
        return false;
    }

    public final void l(g7c g7cVar) {
        if (h() && k()) {
            v5c v5cVar = g7cVar.a;
            if (w9e.C0(v5cVar)) {
                hm9.m0("ru.ok.onechat.reactions.ReactionsViewModel", "updateSelfReaction: reaction is blank!", new Object[0]);
            } else {
                if (this.s.contains(Long.valueOf(g7cVar.c))) {
                    return;
                }
                hm9.m("ru.ok.onechat.reactions.ReactionsViewModel", "updateSelfReaction: %s for %d", v5cVar, Long.valueOf(g7cVar.b));
                this.w.m(null, new p35(g7cVar));
            }
        }
    }

    @uae
    public final void onEvent(tc2 event) {
        long j = this.b;
        Long lValueOf = Long.valueOf(j);
        Long l = event.c;
        hm9.m("ru.ok.onechat.reactions.ReactionsViewModel", "onEvent: ChatLastReactionUpdatedEvent: chat.id = %d, event.lastReactedMessageId = %d", lValueOf, l);
        if (j != event.b || l == null) {
            return;
        }
        long jLongValue = l.longValue();
        csc cscVar = this.g;
        if (cscVar != null) {
            cscVar.b(Long.valueOf(jLongValue), "lastReactedMessageId");
        }
    }

    @uae
    public final void onMessageDeleteEvent(re9 event) {
        if (event.b != this.b) {
            return;
        }
        this.s.addAll(event.X);
    }

    @uae
    public final void onNewReactionEvent(xp9 event) {
        ph phVarG;
        String str;
        if (this.b == event.b) {
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, "ru.ok.onechat.reactions.ReactionsViewModel", "onNewReactionEvent=" + event, null);
            }
            v5c v5cVar = (v5c) x53.h0(event.Y);
            if (v5cVar == null || (phVarG = ((gj) this.m.getValue()).g(v5cVar.a.toString())) == null || (str = phVarG.d) == null) {
                return;
            }
            this.u.g(new s6c(v5cVar, event.o, event.X, str, !event.c));
        }
    }
}
