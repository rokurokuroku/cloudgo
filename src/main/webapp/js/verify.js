$(document).ready(function() {
        $('#defaultForm').bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                userName: {
                    message: '用户名不正确',
                    validators: {
                        notEmpty: {},
                        stringLength: {
                            min: 6,
                            max: 20
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_\.]+$/
                        },
                        remote: {
                            url: 'checkUserName',
                            message: '该用户名已存在'
                        },
                        different: {
                            field: 'userPassword',
                            message: '密码和用户名不能相同'
                        }
                    }
                },
                userEmail: {
                    validators: {
                        emailAddress: {}
                    }
                },
                userPassword: {
                    validators: {
                        notEmpty: {},
                        identical: {
                            field: 'reUserPassword',
                            message: '两次输入密码不一致'
                        },
                        different: {
                            field: 'userName',
                            message: '密码和用户名不能相同'
                        }
                    }
                },
                reUserPassword: {
                    validators: {
                        notEmpty: {},
                        identical: {
                            field: 'userPassword'
                        },
                        different: {
                            field: 'userName',
                            message: '用户名和密码不能相同'
                        }
                    }
                },

                userTelephone: {
                    validators: {
                        notEmpty: {},
                        digits: {},
                        phone: {
                            country: 'cn'
                        }
                    }
                },

                'languages[]': {
                    validators: {
                        notEmpty: {}
                    }
                },
                'programs[]': {
                    validators: {
                        choice: {
                            min: 2,
                            max: 4
                        }
                    }
                }
            }
        });
    });
