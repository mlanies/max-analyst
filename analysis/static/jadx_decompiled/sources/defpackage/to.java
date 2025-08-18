package defpackage;

import scout.Component;

/* loaded from: classes2.dex */
public abstract class to extends Component {
    /* JADX WARN: Illegal instructions before constructor call */
    public to() {
        ruc rucVar = c37.f;
        if (rucVar == null) {
            throw new IllegalArgumentException("Trying to access DI graph before initialization!".toString());
        }
        super(rucVar);
    }
}
