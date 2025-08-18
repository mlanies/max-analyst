package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class etc {
    public final List a;
    public final List b;
    public final List c;
    public final int d;
    public final int e;
    public final int f;

    public etc(List list, List list2, List list3, int i, int i2, int i3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final String toString() {
        return "ScheduledSendPickerData(currentHour=" + this.b.get(this.e) + ", currentMinute=" + this.c.get(this.f) + ")";
    }
}
