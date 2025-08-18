package defpackage;

/* loaded from: classes2.dex */
public enum li6 implements oi6 {
    /* JADX INFO: Fake field, exist only in values array */
    KEYBOARD_RELEASE(7),
    /* JADX INFO: Fake field, exist only in values array */
    VIRTUAL_KEY_RELEASE(8),
    CLOCK_TICK(4),
    /* JADX INFO: Fake field, exist only in values array */
    TEXT_HANDLE_MOVE(9),
    /* JADX INFO: Fake field, exist only in values array */
    GESTURE_END(13);

    public final int a;

    li6(int i) {
        this.a = i;
    }

    @Override // defpackage.oi6
    public final int a() {
        return this.a;
    }
}
