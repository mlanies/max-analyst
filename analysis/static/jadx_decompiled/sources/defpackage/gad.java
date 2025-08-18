package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class gad {
    public final SessionConfiguration a;

    public gad(int i, ArrayList arrayList, Executor executor, rv1 rv1Var) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((OutputConfiguration) ((tna) it.next()).a.c());
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(i, arrayList2, executor, rv1Var);
        this.a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList3 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            arrayList3.add(outputConfiguration == null ? null : new tna(Build.VERSION.SDK_INT >= 33 ? new wna(outputConfiguration) : new vna(new una(outputConfiguration))));
        }
        Collections.unmodifiableList(arrayList3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gad)) {
            return false;
        }
        return Objects.equals(this.a, ((gad) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
