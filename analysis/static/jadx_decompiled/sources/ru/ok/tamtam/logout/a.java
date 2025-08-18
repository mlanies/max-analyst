package ru.ok.tamtam.logout;

import defpackage.od2;
import defpackage.rg7;
import defpackage.t03;
import defpackage.v7c;
import defpackage.w7c;
import defpackage.wld;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public interface a {
    default Object a(Continuation continuation) {
        return od2.A(new t03(new v7c(((LogoutEventsByBus) this).b), 11), continuation);
    }

    void b();

    default w7c c(rg7 rg7Var) {
        return od2.X(new t03(new v7c(((LogoutEventsByBus) this).b), 22), rg7Var, wld.b, Boolean.FALSE);
    }
}
