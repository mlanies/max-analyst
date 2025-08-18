package defpackage;

import java.io.IOException;
import ru.ok.android.api.json.JsonSerializeException;

/* loaded from: classes2.dex */
public abstract class b0 implements fl {
    private volatile el cachedParams;

    public final synchronized el a() {
        el elVar = this.cachedParams;
        if (elVar != null) {
            return elVar;
        }
        el elVar2 = new el();
        populateParams(elVar2);
        this.cachedParams = elVar2;
        return elVar2;
    }

    public boolean canRepeat() {
        return a().b;
    }

    public final synchronized void invalidateParams() {
        this.cachedParams = null;
    }

    public abstract void populateParams(el elVar);

    @Override // defpackage.fl
    public boolean shouldPost() {
        return a().c;
    }

    @Override // defpackage.fl
    public final boolean willWriteParams() {
        return a().d;
    }

    @Override // defpackage.fl
    public final boolean willWriteSupplyParams() {
        return a().e;
    }

    @Override // defpackage.fl
    public final void writeParams(kb7 kb7Var) throws JsonSerializeException, IOException {
        a().c(kb7Var);
    }

    @Override // defpackage.fl
    public final void writeSupplyParams(kb7 kb7Var) throws JsonSerializeException, IOException {
        a().d(kb7Var);
    }
}
