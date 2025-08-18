package ru.ok.tamtam.login;

import androidx.annotation.Keep;
import defpackage.av0;
import defpackage.j1e;
import defpackage.j47;
import defpackage.kke;
import defpackage.kld;
import defpackage.lld;
import defpackage.uae;
import defpackage.ut7;
import defpackage.v7c;
import defpackage.vt7;
import defpackage.w9a;
import kotlin.Metadata;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/tamtam/login/LoginEventsByBus;", "Lvt7;", "Lut7;", "event", "Le5f;", "onEvent", "(Lut7;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class LoginEventsByBus implements vt7 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public LoginEventsByBus(av0 av0Var, kke kkeVar) {
        this.b = j1e.a(((w9a) kkeVar).c().getImmediate());
        av0Var.d(this);
    }

    @Keep
    @uae
    public final void onEvent(ut7 event) {
        j47.T(this.b, null, null, new a(this, event, null), 3);
    }

    @Override // defpackage.vt7
    public final v7c stream() {
        return new v7c(this.a);
    }
}
