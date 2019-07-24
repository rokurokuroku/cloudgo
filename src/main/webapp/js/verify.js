$(document).ready(function() {
        $('#defaultForm').bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                username: {
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
                            url: 'remote.php',
                            message: '该用户名不可用'
                        },
                        different: {
                            field: 'password',
                            message: '密码和用户名不能相同'
                        }
                    }
                },
                email: {
                    validators: {
                        emailAddress: {}
                    }
                },
                password: {
                    validators: {
                        notEmpty: {},
                        identical: {
                            field: 'confirmPassword',
                            message: '两次输入密码不一致'
                        },
                        different: {
                            field: 'username',
                            message: '密码和用户名不能相同'
                        }
                    }
                },
                confirmPassword: {
                    validators: {
                        notEmpty: {},
                        identical: {
                            field: 'password'
                        },
                        different: {
                            field: 'username',
                            message: '用户名和密码不能相同'
                        }
                    }
                },

                phoneNumber: {
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
