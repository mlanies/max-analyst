package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qfa extends da9 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfa(int i) {
        super(2, 3);
        this.c = i;
        switch (i) {
            case 1:
                super(3, 4);
                this.d = new oq9(13);
                break;
            case 2:
                super(14, 15);
                this.d = new xxc();
                break;
            default:
                this.d = new mq9(13);
                break;
        }
    }

    @Override // defpackage.da9
    public final void a(k36 k36Var) {
        switch (this.c) {
            case 0:
                ey8.l(k36Var, "CREATE TABLE IF NOT EXISTS `_new_messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `ttl` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `zoom` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )", "INSERT INTO `_new_messages` (`id`,`server_id`,`time`,`update_time`,`sender`,`cid`,`text`,`delivery_status`,`status`,`time_local`,`error`,`localized_error`,`attaches`,`media_type`,`detect_share`,`msg_link_type`,`msg_link_id`,`inserted_from_msg_link`,`msg_link_chat_id`,`msg_link_chat_name`,`msg_link_chat_link`,`msg_link_out_chat_id`,`msg_link_out_msg_id`,`type`,`chat_id`,`ttl`,`channel_views`,`channel_forwards`,`view_time`,`zoom`,`options`,`live_until`,`elements`,`reactions`,`delayed_attrs_time_to_fire`,`delayed_attrs_notify_sender`) SELECT `id`,`server_id`,`time`,`update_time`,`sender`,`cid`,`text`,`delivery_status`,`status`,`time_local`,`error`,`localized_error`,`attaches`,`media_type`,`detect_share`,`msg_link_type`,`msg_link_id`,`inserted_from_msg_link`,`msg_link_chat_id`,`msg_link_chat_name`,`msg_link_chat_link`,`msg_link_out_chat_id`,`msg_link_out_msg_id`,`type`,`chat_id`,`ttl`,`channel_views`,`channel_forwards`,`view_time`,`zoom`,`options`,`live_until`,`elements`,`reactions`,`delayed_attrs_time_to_fire`,`delayed_attrs_notify_sender` FROM `messages`", "DROP TABLE `messages`", "ALTER TABLE `_new_messages` RENAME TO `messages`");
                ey8.l(k36Var, "CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)", "CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)", "CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)", "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)");
                k36Var.U("CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)");
                k36Var.U("CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)");
                Cursor cursorQ0 = k36Var.q0("PRAGMA foreign_key_check(`messages`)");
                try {
                    if (cursorQ0.getCount() <= 0) {
                        v3c.i(cursorQ0, null);
                        k36Var.U("CREATE TABLE IF NOT EXISTS `_new_stickers` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sticker_id` INTEGER NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `url` TEXT, `update_time` INTEGER NOT NULL, `mp4_url` TEXT, `first_url` TEXT, `preview_url` TEXT, `tags` TEXT NOT NULL, `sticker_type` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `lottie_url` TEXT, `audio` INTEGER NOT NULL, `author_type` INTEGER NOT NULL)");
                        k36Var.U("INSERT INTO `_new_stickers` (`id`,`sticker_id`,`width`,`height`,`url`,`update_time`,`mp4_url`,`first_url`,`preview_url`,`tags`,`sticker_type`,`set_id`,`lottie_url`,`audio`,`author_type`) SELECT `id`,`sticker_id`,`width`,`height`,`url`,`update_time`,`mp4_url`,`first_url`,`preview_url`,`tags`,`sticker_type`,`set_id`,`lottie_url`,`audio`,`author_type` FROM `stickers`");
                        k36Var.U("DROP TABLE `stickers`");
                        k36Var.U("ALTER TABLE `_new_stickers` RENAME TO `stickers`");
                        ((mq9) this.d).getClass();
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    int count = cursorQ0.getCount();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (cursorQ0.moveToNext()) {
                        if (cursorQ0.isFirst()) {
                            sb.append("Foreign key violation(s) detected in '");
                            sb.append(cursorQ0.getString(0));
                            sb.append("'.\n");
                        }
                        String string = cursorQ0.getString(3);
                        if (!linkedHashMap.containsKey(string)) {
                            linkedHashMap.put(string, cursorQ0.getString(2));
                        }
                    }
                    sb.append("Number of different violations discovered: ");
                    sb.append(linkedHashMap.keySet().size());
                    sb.append("\nNumber of rows in violation: ");
                    sb.append(count);
                    sb.append("\nViolation(s) detected in the following constraint(s):\n");
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        sb.append("\tParent Table = ");
                        sb.append(str2);
                        sb.append(", Foreign Key Constraint Index = ");
                        sb.append(str);
                        sb.append("\n");
                    }
                    throw new SQLiteConstraintException(sb.toString());
                } finally {
                }
            case 1:
                ey8.l(k36Var, "CREATE TABLE IF NOT EXISTS `_new_phones` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `phonebook_id` INTEGER NOT NULL, `contact_id` INTEGER NOT NULL, `phone` TEXT NOT NULL, `server_phone` INTEGER NOT NULL, `email` TEXT, `first_name` TEXT NOT NULL, `last_name` TEXT, `avatar_path` TEXT, `type` INTEGER NOT NULL)", "INSERT INTO `_new_phones` (`id`,`phonebook_id`,`contact_id`,`phone`,`server_phone`,`email`,`first_name`,`avatar_path`,`type`) SELECT `id`,`phonebook_id`,`contact_id`,`phone`,`server_phone`,`email`,`name`,`avatar_path`,`type` FROM `phones`", "DROP TABLE `phones`", "ALTER TABLE `_new_phones` RENAME TO `phones`");
                k36Var.U("CREATE INDEX IF NOT EXISTS `index_phones_phonebook_id` ON `phones` (`phonebook_id`)");
                k36Var.U("CREATE INDEX IF NOT EXISTS `index_phones_type` ON `phones` (`type`)");
                k36Var.U("CREATE INDEX IF NOT EXISTS `index_phones_server_phone` ON `phones` (`server_phone`)");
                ((oq9) this.d).getClass();
                k36Var.U("DELETE FROM phones");
                return;
            default:
                ey8.l(k36Var, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))", "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`", "DROP TABLE `WorkSpec`", "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                k36Var.U("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                k36Var.U("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                ((xxc) this.d).getClass();
                k36Var.U("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                k36Var.s0(contentValues, new Object[0]);
                return;
        }
    }
}
