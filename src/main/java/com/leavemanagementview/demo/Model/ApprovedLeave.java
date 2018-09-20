package com.leavemanagementview.demo.Model;

import java.util.Date;

public class ApprovedLeave {

        int LeaveId;

        public int getLeaveId() {
            return LeaveId;
        }

        public void setLeaveId(int leaveId) {
            LeaveId = leaveId;
        }

        String username;
        Date fromDate;
        Date toDate;
        String Type;
        String reason;
        int noOfDays;

        public ApprovedLeave() {
        }

        public int getNoOfDays() {
            return noOfDays;
        }

        public void setNoOfDays(int noOfDays) {
            this.noOfDays = noOfDays;
        }

        public ApprovedLeave(int leaveId, String username, Date fromDate, Date toDate, String type, String reason, int noOfDays) {
            LeaveId = leaveId;
            this.username = username;
            this.fromDate = fromDate;
            this.toDate = toDate;
            Type = type;
            this.reason = reason;
            this.noOfDays = noOfDays;
        }

        public String getReason() {

            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Date getFromDate() {
            return fromDate;
        }

        public void setFromDate(Date fromDate) {
            this.fromDate = fromDate;
        }

        public Date getToDate() {
            return toDate;
        }

        public void setToDate(Date toDate) {
            this.toDate = toDate;
        }

        public String getType() {
            return Type;
        }

        public void setType(String type) {
            Type = type;
        }
    }
