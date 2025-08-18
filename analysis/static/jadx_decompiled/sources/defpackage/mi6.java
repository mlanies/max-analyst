package defpackage;

/* loaded from: classes2.dex */
public enum mi6 implements oi6 {
    /* JADX INFO: Fake field, exist only in values array */
    KEYBOARD_PRESS(3),
    VIRTUAL_KEY(1),
    KEYBOARD_TAP(3),
    CONTEXT_CLICK(6),
    GESTURE_START(12),
    CONFIRM(16);

    public final int a;

    mi6(int i) {
        this.a = i;
    }

    @Override // defpackage.oi6
    public final int a() {
        return this.a;
    }
}
