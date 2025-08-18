package defpackage;

import java.util.BitSet;

/* loaded from: classes2.dex */
public final class ifd extends u2 {
    @Override // defpackage.u2
    public final String toString() {
        BitSet bitSet = (BitSet) this.b;
        return x9e.b0("\n            Payload(\n                isSectionChanged=" + bitSet.get(0) + ",\n                isTitleChanged=" + bitSet.get(1) + ",\n                isTypeChanged=" + bitSet.get(2) + ",\n                isDescriptionResChanged=" + bitSet.get(3) + ",\n                isStartIconResChanged=" + bitSet.get(4) + ",\n                isEndViewChanged=" + bitSet.get(5) + ",\n                isCounterTypeChanged=" + bitSet.get(6) + ",\n                isUpperTextChanged=" + bitSet.get(7) + "\n                isStartIconPaddingChanged=" + bitSet.get(4) + "\n            )\n        ");
    }
}
